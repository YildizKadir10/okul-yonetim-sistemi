package com.okulyonetimsistemi.okulyonetimsistemi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Öğrenci numarası boş olamaz")
    private String studentNumber;

    @Column(nullable = false)
    @NotBlank(message = "Ad boş olamaz")
    private String firstName;

    @Column(nullable = false)
    @NotBlank(message = "Soyad boş olamaz")
    private String lastName;

    @Column(nullable = false)
    @Pattern(regexp = "^0[0-9]{10}$", message = "Telefon numarası 0 ile başlamalı ve 11 haneli olmalıdır")
    private String parentPhone;

    @Column(nullable = false)
    private String grade;

    @Column(nullable = false)
    @Pattern(regexp = "^[A-F]$", message = "Şube A-F arasında olmalıdır")
    private String section;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class studentClass;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Class getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Class studentClass) {
        this.studentClass = studentClass;
    }
} 