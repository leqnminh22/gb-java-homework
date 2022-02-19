package ru.mle.homework11;

import java.util.Arrays;
import java.util.List;

public class Homework11 {

    public static void main(String[] args) {

        String[] words = {"angel", "boy", "sport", "ball", "world", "lights"};
        Integer[] numbers = {1, 3, 0, -10, 40, 90};

        System.out.println("Список #1 до перестановки:");
        System.out.println(convertList(words));

        System.out.println("Список #1 после перестановки:");
        swapper(words,1,2);
        System.out.println(convertList(words));

        System.out.println("\n-----------\n");

        System.out.println("Список #2 до перестановки:");
        System.out.println(convertList(numbers));

        System.out.println("Список #2 после перестановки:");
        swapper(numbers,0,5);
        System.out.println(convertList(numbers));

    }

    /**
     * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
     */

    public static <T> void swapper(T[] array, int a, int b) {

        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */

    public static <N> List<N> convertList (N[] array){
        return Arrays.asList(array);
    }
}
