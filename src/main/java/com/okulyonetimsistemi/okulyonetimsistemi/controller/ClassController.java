package com.okulyonetimsistemi.okulyonetimsistemi.controller;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Class;
import com.okulyonetimsistemi.okulyonetimsistemi.service.ClassService;
import com.okulyonetimsistemi.okulyonetimsistemi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/siniflar")
public class ClassController {

    @Autowired
    private ClassService classService;

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String listClasses(Model model) {
        model.addAttribute("classes", classService.getAllClasses());
        model.addAttribute("teachers", teacherService.getAllTeachers());
        model.addAttribute("newClass", new Class());
        return "class/list";
    }

    @PostMapping("/kaydet")
    public String saveClass(@ModelAttribute("newClass") Class class_) {
        classService.saveClass(class_);
        return "redirect:/siniflar";
    }

    @PostMapping("/guncelle")
    public String updateClass(@ModelAttribute("class") Class class_) {
        classService.saveClass(class_);
        return "redirect:/siniflar";
    }

    @GetMapping("/duzenle/{id}")
    public String editClass(@PathVariable Long id, Model model) {
        model.addAttribute("class", classService.getClassById(id));
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "class/edit";
    }

    @PostMapping("/sil/{id}")
    public String deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return "redirect:/siniflar";
    }
} 