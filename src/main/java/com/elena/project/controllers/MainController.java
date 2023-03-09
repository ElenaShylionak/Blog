package com.elena.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping("/") //главная страница
    public String home(Model model) {
       model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about") //главная страница
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }

}