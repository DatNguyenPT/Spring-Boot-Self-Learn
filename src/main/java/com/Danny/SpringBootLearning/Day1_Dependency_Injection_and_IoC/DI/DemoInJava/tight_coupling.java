package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInJava;

public class tight_coupling {
    public class BubbleSort{
        public void sort(int[] array){
            // logic
        }
    }
    public class ComplexService{
        private BubbleSort bubbleSort = new BubbleSort();
        public ComplexService(){}
        public void sortService(int[] array){
            bubbleSort.sort(array);
        }
    }
}
/*
* Ta thấy BubbleSort chỉ tồn tại khi ComplexService tồn tại và cần
* Nếu muốn đổi sang QuickSort thì cần thay đổi nhiều vào ComplexService
* */
