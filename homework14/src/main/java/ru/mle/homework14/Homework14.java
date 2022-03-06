package ru.mle.homework14;

import java.util.Arrays;

public class Homework14 {

    public static void main(String[] args) {

        /**
         * Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив,
         * который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы
         * одну четверку, иначе в методе необходимо выбросить RuntimeException.
         * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
         * Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
         *
         * Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false;
         * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
         * [ 1 1 1 4 4 1 4 4 ] -> true
         * [ 1 1 1 1 1 1 ] -> false
         * [ 4 4 4 4 ] -> false
         * [ 1 4 4 1 1 4 3 ] -> false
         */
        int [] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(Arrays.toString(checkArray1(arr)));

    }

    public static int[] checkArray1(int [] arr) {
        int x = 0;
        int [] result = null;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if(arr[j] == 4) continue;
                    result[k] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;
    }

    public static boolean checkArray2(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4) return false;
        }
        return true;
    }

}
