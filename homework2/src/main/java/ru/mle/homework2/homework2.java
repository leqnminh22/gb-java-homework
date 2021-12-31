package ru.mle.homework2;

import java.util.Arrays;
import java.util.Random;

public class homework2 {
    public static void main(String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(invert(arr01)));
        System.out.println();

        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21

        int[] arr02 = new int[8];
        System.out.println(Arrays.toString(fillArr(arr02)));
        System.out.println();

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(change(arr03)));
        System.out.println();

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        fillDiagonal(4);

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        Random random = new Random();
        int[] arr05 = new int [10];
        for(int i = 0; i < arr05.length; i++)
            arr05[i] = random.nextInt(50);
        System.out.println(Arrays.toString(arr05));

        System.out.println("Максимальное значение массива: " + findMax(arr05));
        System.out.println("Минимальное значение массива: " + findMin(arr05));

    }

    // -----------------------------------------------------

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 2

    public static int[] fillArr(int[] array) {
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;
        }
        return array;
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static int[] change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == (size - i - 1)) {
                    table[i][j] = 1;
                } else {

                    table[i][j] = (int)(Math.random()*10);
                }
                System.out.printf("%5d", table[i][j]);
            }
            System.out.println();
        }

    }

    // 5** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }

        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }

        }
        return max;
    }
}




