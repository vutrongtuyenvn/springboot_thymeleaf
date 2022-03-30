package com.thymeleaf.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Index {
    @GetMapping
    public String index(Model model){
        model.addAttribute("title","index pages");
        model.addAttribute("employee",new Employee());
        return "index";
    }
    @PostMapping("/add")
    public String add(Employee employee, ModelMap modelMap){
        modelMap.addAttribute("title","added");
        modelMap.addAttribute("employee",employee);
        return "index";
    }
}
