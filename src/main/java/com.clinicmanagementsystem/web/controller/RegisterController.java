package com.clinicmanagementsystem.web.controller;

import com.clinicmanagementsystem.dao.entity.Role;
import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.dao.repository.RoleRepository;
import com.clinicmanagementsystem.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @ModelAttribute ("userForm")
    public User user() {
        return new User();
    }

    @GetMapping ("/login")
    public String login() {
        return "login";
    }

    @GetMapping ("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping ("/register")
    public String registration(User user) {
        Role userRole = roleRepository.findByName("PATIENT");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(userRole);
        userRepository.save(user);
        return "redirect:login";
    }

    @GetMapping ("/register")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "register";
    }
}
