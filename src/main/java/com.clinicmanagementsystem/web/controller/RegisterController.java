package com.clinicmanagementsystem.web.controller;

import com.clinicmanagementsystem.dao.entity.User;
import com.clinicmanagementsystem.service.api.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {

    private UserService userService;

    @GetMapping ("/register")
    public String registration(ModelMap model) {
        model.addAttribute("userForm", new User());
        return "redirect:home";
    }


    @PostMapping ("/register")
    public String addUser(@ModelAttribute ("userForm") @Valid User userForm, BindingResult bindingResult, ModelMap model) {

        if (bindingResult.hasErrors()) {
            return "redirect:home";
        }
        if (!userService.create(userForm)) {
            model.addAttribute("usernameError", "Пользователь с таким именем уже существует!");
            return "redirect:about";
        }

        return "redirect:login";
    }

}
