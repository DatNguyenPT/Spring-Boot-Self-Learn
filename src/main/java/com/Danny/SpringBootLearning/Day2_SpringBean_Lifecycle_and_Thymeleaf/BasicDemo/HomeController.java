package com.Danny.SpringBootLearning.Day2_SpringBean_Lifecycle_and_Thymeleaf.BasicDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homeScreen(){
        return "index";
    }
}
