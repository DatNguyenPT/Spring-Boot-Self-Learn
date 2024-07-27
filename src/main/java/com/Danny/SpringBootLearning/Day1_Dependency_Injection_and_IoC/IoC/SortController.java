package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.IoC;

import com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInSpringBoot.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
    private final SortService sortService;
    @Autowired
    public SortController(SortService sortService){
        this.sortService = sortService;
    }
    public void Sort(int[] array){
        sortService.sort(array);
    }
}
/*
* Với IoC, vấn đề đã được giải quyết, ta đang sử dụng Bubble Sort
* */