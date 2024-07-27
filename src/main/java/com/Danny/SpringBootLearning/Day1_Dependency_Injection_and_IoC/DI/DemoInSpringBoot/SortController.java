package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInSpringBoot;

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
* Vấn đề xảy ra ở đây là ta dùng hàm sort trong SortService, nghĩa là ta đang quan tâm đến nghiệp vụ
* chứ không hề biết là đang dùng quick sort hay bubble sort
*
* Để giải quyết vấn đề này, ta sẽ đưa các beans (bubble và quick) vào trong 1 container và sử dụng cơ chế IoC
* */
