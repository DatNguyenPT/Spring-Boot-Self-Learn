package com.Danny.SpringBootLearning.Day2_SpringBean_Lifecycle_and_Thymeleaf.Spring_Lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Đánh dấu class là 1 bean cho phép IoC tự động phát hiện
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // Tạo 1 instance duy nhất cho toàn bộ container
public class MyBean {
    public MyBean() {
        System.out.println("Bean is being created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is initialized");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is being destroyed");
    }
}
