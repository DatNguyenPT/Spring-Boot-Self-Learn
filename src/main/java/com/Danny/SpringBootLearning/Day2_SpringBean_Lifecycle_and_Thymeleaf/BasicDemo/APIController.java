package com.Danny.SpringBootLearning.Day2_SpringBean_Lifecycle_and_Thymeleaf.BasicDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class APIController {
    private final LoginService loginService;

    @Autowired
    public APIController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequest loginRequest) {
        return loginService.login(loginRequest);
    }
}

