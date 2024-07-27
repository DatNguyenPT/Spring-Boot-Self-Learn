package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface SortService {
    public void sort(int[] array);
}
