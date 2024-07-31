package com.Danny.SpringBootLearning.Day3_MoreAnnotations.ConfigurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class Demo implements CommandLineRunner {
    private final MyAppProperties myAppProperties;
    @Autowired
    public Demo(MyAppProperties myAppProperties){
        this.myAppProperties = myAppProperties;
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("name: " + myAppProperties.getName() + "\n");
        System.out.println("email: " + myAppProperties.getEmail() + "\n");
        System.out.println("list: " + myAppProperties.getList() + "\n");
        System.out.println("map: " + myAppProperties.getMap() + "\n");
    }
}
