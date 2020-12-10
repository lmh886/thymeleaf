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

    @GetMapping("/showImage")
    public String showImage(Model model){
        model.addAttribute("url","cat.jpg");
        return "image";
    }

    @GetMapping("/showModel")
    public String showModel(Model model){
        model.addAttribute("username","xiaohua");
        return "model";
    }

    @GetMapping("/if")
    public String ifModel(Model model){
        model.addAttribute("flag1","yes");
        model.addAttribute("flag2",true);
        return "if";
    }

    @GetMapping("/switch")
    public String switchModel(Model model){
        model.addAttribute("type","manager");
        return "switch";
    }

    @GetMapping("/showStaticResource")
    public String showStaticResource(){
        return "showStatic";
    }

    @GetMapping("/showFragment")
    public String showFragment(){
        return "importFragment";
    }

    @GetMapping("/showInnerObject")
    public String showInnerObject(Model model){
        model.addAttribute("num",92345.12387);
        model.addAttribute("str","携手最具影响力的中文知识平台，用知识的价值提升品牌的价值。针对不同类型的权威机构提供丰富的合作模式，开展基于知识传播的公益合作，强势展现合作方优质资源，提升品牌影响力。");
        return "innerObject";
    }
}
