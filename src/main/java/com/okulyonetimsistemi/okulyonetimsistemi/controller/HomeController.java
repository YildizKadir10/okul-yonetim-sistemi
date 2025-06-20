package com.okulyonetimsistemi.okulyonetimsistemi.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("message", "Okul Yönetim Sistemine Hoş Geldiniz");
        model.addAttribute("username", auth.getName());
        return "index";
    }
} 