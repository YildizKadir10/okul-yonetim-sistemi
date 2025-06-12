package com.okulyonetimsistemi.okulyonetimsistemi.repository;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
} 