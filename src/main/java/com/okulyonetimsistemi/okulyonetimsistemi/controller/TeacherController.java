package com.okulyonetimsistemi.okulyonetimsistemi.controller;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Teacher;
import com.okulyonetimsistemi.okulyonetimsistemi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ogretmenler")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        model.addAttribute("newTeacher", new Teacher());
        return "teacher/list";
    }

    @PostMapping("/kaydet")
    public String saveTeacher(@ModelAttribute("newTeacher") Teacher teacher) {
        // Sicil numarası otomatik oluşturulsun
        long count = teacherService.getAllTeachers().size();
        String newTeacherNumber = String.format("T%03d", count + 1);
        teacher.setTeacherNumber(newTeacherNumber);
        // E-posta otomatik oluşturulsun
        String email = teacher.getFirstName().toLowerCase().replace(" ", ".") + "." + teacher.getLastName().toLowerCase().replace(" ", ".") + "@okul.com";
        teacher.setEmail(email);
        teacherService.saveTeacher(teacher);
        return "redirect:/ogretmenler";
    }

    @GetMapping("/duzenle/{id}")
    public String editTeacher(@PathVariable Long id, Model model) {
        Teacher teacher = teacherService.getTeacherById(id).orElse(null);
        model.addAttribute("teacher", teacher);
        return "teacher/edit";
    }

    @PostMapping("/sil/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "redirect:/ogretmenler";
    }
} 