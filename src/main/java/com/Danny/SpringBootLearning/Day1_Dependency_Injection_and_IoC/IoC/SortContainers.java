package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.IoC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SortContainers {
    @Bean
    @Qualifier("BubbleSort")
    @Primary
    public Sort BubbleSort(){
        return new BubbleSort();
    }
    @Bean
    @Qualifier("QuickSort")
    public Sort QuickSort(){
        return new QuickSort();
    }
}

/*
* @Primary thì bean đó sẽ được ưu tiên dùng để inject
* */
