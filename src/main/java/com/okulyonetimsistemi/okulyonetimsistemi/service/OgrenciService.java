package com.okulyonetimsistemi.okulyonetimsistemi.service;

import com.okulyonetimsistemi.okulyonetimsistemi.model.Ogrenci;
import com.okulyonetimsistemi.okulyonetimsistemi.repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OgrenciService {

    @Autowired
    private OgrenciRepository ogrenciRepository;

    public List<Ogrenci> tumOgrencileriGetir() {
        return ogrenciRepository.findAll();
    }

    public Ogrenci ogrenciKaydet(Ogrenci ogrenci) {
        return ogrenciRepository.save(ogrenci);
    }

    public Optional<Ogrenci> ogrenciGetir(Long id) {
        return ogrenciRepository.findById(id);
    }

    public void ogrenciSil(Long id) {
        ogrenciRepository.deleteById(id);
    }
} 