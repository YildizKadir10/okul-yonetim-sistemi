package com.okulyonetimsistemi.okulyonetimsistemi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teachers")
@Data
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Ad boş olamaz")
    private String firstName;
    
    @NotBlank(message = "Soyad boş olamaz")
    private String lastName;
    
    @NotBlank(message = "Branş boş olamaz")
    private String subject;
    
    @NotBlank(message = "E-posta boş olamaz")
    @Email(message = "Geçerli bir email adresi giriniz")
    private String email;
    
    @NotBlank(message = "Öğretmen numarası boş olamaz")
    @Column(unique = true, nullable = false)
    private String teacherNumber;
    
    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Class> classes = new ArrayList<>();
} 