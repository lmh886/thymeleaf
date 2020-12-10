package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController1 {

    @GetMapping("/hello")
    public String index(Model model){
        String msg = "hello,thymeleaf";
        model.addAttribute("msg",msg);
        return "index";
    }

    @GetMapping("/showPerson")
    public String show(Model model){
        Person person = new Person(2001, "小白", 12);
        model.addAttribute("person",person);
        return "person";
    }
}
