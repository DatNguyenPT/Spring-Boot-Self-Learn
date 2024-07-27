package com.Danny.SpringBootLearning.Day1_Dependency_Injection_and_IoC.DI.DemoInJava;

public class loosely_coupling {
    public interface Sort{
        void sortLogic(int[] array);
    }
    public class BubbleSort implements Sort{
        @Override
        public void sortLogic(int[] array){
            // Bubble sort logic
        }
    }

    public class QuickSort implements Sort{
        @Override
        public void sortLogic(int[] array){
            // Quick sort logic
        }
    }

    // Quan tâm nghiệp vụ, không cần quan tâm logic
    public class ComplexService{
        private Sort sort;
        public ComplexService(Sort sort){
            this.sort = sort;
        }

        public void sortService(int[] array){
            sort.sortLogic(array);
        }
    }

    // Sort theo từng loại
    public void main(String[] args) {
        int[] array = new int[10];
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        ComplexService complexServiceWithBubbleSort = new ComplexService(bubbleSort);
        ComplexService complexServiceWithQuickSort = new ComplexService(quickSort);
        complexServiceWithBubbleSort.sortService(array);
        complexServiceWithQuickSort.sortService(array);
    }
}

/*
* Ta đã sử dụng Constructor Injection, giúp bỏ sự phụ thuộc giữa BubbleSort và QuickSort với ComplexService
* */
