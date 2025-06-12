package com.okulyonetimsistemi.okulyonetimsistemi.service;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Class;
import com.okulyonetimsistemi.okulyonetimsistemi.model.Teacher;
import com.okulyonetimsistemi.okulyonetimsistemi.repository.ClassRepository;
import com.okulyonetimsistemi.okulyonetimsistemi.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class saveClass(Class classEntity) {
        // Eğer teacher id geliyorsa teacher nesnesini bul ve ata
        if (classEntity.getTeacher() != null && classEntity.getTeacher().getId() != null) {
            Teacher teacher = teacherRepository.findById(classEntity.getTeacher().getId()).orElse(null);
            classEntity.setTeacher(teacher);
        } else {
            classEntity.setTeacher(null);
        }
        return classRepository.save(classEntity);
    }

    public Optional<Class> getClassById(Long id) {
        return classRepository.findById(id);
    }

    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
} 