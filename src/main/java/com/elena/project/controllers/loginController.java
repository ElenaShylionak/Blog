package com.elena.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/login")
    public String blogMain(Model model){
        model.addAttribute("title", "Форма входа");
        return "login";
    }

}


