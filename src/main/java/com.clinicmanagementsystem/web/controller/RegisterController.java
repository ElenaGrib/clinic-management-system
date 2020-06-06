package com.clinicmanagementsystem.web.controller;

import com.clinicmanagementsystem.dao.entity.Role;
import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.dao.repository.RoleRepository;
import com.clinicmanagementsystem.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

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

    @ModelAttribute ()
    @GetMapping ("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping ("/register")
    public String registration(@Valid User user, BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (fieldErrors.isEmpty()) {
            Role userRole = roleRepository.findByName("DOCTOR");
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRole(userRole);
            userRepository.save(user);
            return "redirect:login";
        } else {
            return fieldErrors.toString();
        }
    }

    @GetMapping ("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping ("/feedback")
    public String feedbackPage() {
        return "feedback";
    }

    @GetMapping ("/about")
    public String aboutPage() {
        return "about";
    }
}
