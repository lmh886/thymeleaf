package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/showList")
    public String showList(Model model){
        List list = new ArrayList();
        for (int i=0;i<5;i++){
            list.add(new Person(2000 + i ,"小花" + i,12 + i));
        }
        model.addAttribute("list",list);

        List maps = new ArrayList();
        for (int i=0;i<5;i++){
            Map map = new HashMap();
            map.put("name","map"+i);
            map.put("id",2001 + i);
            map.put("age",19 + i);
            maps.add(map);
        }
        model.addAttribute("maps",maps);
        return "list";
    }
}
