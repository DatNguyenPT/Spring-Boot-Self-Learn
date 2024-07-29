package com.Danny.SpringBootLearning.Day2_SpringBean_Lifecycle_and_Thymeleaf.BasicDemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {
    private List<User> user = new ArrayList<>();

    public LoginService(){
        user.add(new User("Test", "2810"));
    }

    public boolean login(LoginRequest loginRequest){
        return user.stream()
                .anyMatch(u -> u.getUsername().equals(loginRequest.getUsername()) &&
                        u.getPassword().equals(loginRequest.getPassword()));
    }
}

