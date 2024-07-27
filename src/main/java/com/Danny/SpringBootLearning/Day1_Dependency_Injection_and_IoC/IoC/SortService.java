package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SortService {
    private final Sort sort;
    @Autowired
    public SortService(@Qualifier("BubbleSort") Sort sort){
        this.sort = sort;
    }
    public void sort(int[] array){
        sort.sort(array);
    }
}

/*
* Lúc này service đã được mặc định sử dụng BubbleSort, nếu muốn đổi ta chỉ cần thay đổi Qualifier
* */
