package com.okulyonetimsistemi.okulyonetimsistemi.controller;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Student;
import com.okulyonetimsistemi.okulyonetimsistemi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ogrenciler")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        Student newStudent = new Student();
        newStudent.setStudentNumber(generateNewStudentNumber());
        model.addAttribute("newStudent", newStudent);
        return "student/list";
    }

    @PostMapping("/kaydet")
    public String saveStudent(@ModelAttribute("newStudent") Student student) {
        studentService.saveStudent(student);
        return "redirect:/ogrenciler";
    }

    @GetMapping("/duzenle/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "student/edit";
    }

    @PostMapping("/sil/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/ogrenciler";
    }

    private String generateNewStudentNumber() {
        long count = studentService.getAllStudents().size();
        return "ogrno" + (count + 1);
    }
} 