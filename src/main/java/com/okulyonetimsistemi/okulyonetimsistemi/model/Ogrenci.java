package com.okulyonetimsistemi.okulyonetimsistemi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class Ogrenci {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Öğrenci numarası boş olamaz")
    private String ogrNo;
    
    @NotBlank(message = "Ad boş olamaz")
    private String ad;
    
    @NotBlank(message = "Soyad boş olamaz")
    private String soyad;
    
    @Pattern(regexp = "^0[0-9]{10}$", message = "Telefon numarası 0 ile başlamalı ve 11 haneli olmalıdır")
    private String veliTelefon;
    
    @Min(value = 9, message = "Sınıf 9'dan küçük olamaz")
    @Min(value = 12, message = "Sınıf 12'den büyük olamaz")
    private Integer sinif;
    
    @Pattern(regexp = "^[A-F]$", message = "Şube A-F arasında olmalıdır")
    private String sube;
} 