package com.ict.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/name")
    public String name(Model model){
        model.addAttribute("jane", "jane");
        return "name";
    }
}
