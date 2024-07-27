package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInSpringBoot;

import org.springframework.stereotype.Service;

@Service
public class QuickSortService implements SortService {
    @Override
    public void sort(int[] array) {
        // Quick sort logic
    }
}
