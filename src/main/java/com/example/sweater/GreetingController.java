package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
//программный модуль, который по пути (сейчас /greeting) случает запросы от пользователя и возвращает какие-то данные ему
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name, //ожидает на вход параметр name
            Map<String, Object> model //model - то куда будем складывать данные, которые хотим вернуть пользователю.
    ) {
        model.put("name", name); //в поле name ложим то, что получили из 14 строчки
        return "greeting"; // возвращает файл шаблон greeting из папки ресурсов
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }
}