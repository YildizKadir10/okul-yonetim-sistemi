package com.okulyonetimsistemi.okulyonetimsistemi.service;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Teacher;
import com.okulyonetimsistemi.okulyonetimsistemi.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
} 