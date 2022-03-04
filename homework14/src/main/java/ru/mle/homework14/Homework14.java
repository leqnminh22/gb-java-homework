package ru.mle.homework14;

import java.util.Arrays;
import java.util.List;

public class Homework14 {

    public static void main(String[] args) {

        int[] arr01 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr02 = {0,2,3,4,1,5,3,0};
        int[] arr03 = {0,2,3,2,1,5,3,0};
        int[] arr04 = {1,1,1,4,4,1,4,4};

        /**
         * task 1
         */

        System.out.println(Arrays.toString(array1(arr01)));
        System.out.println(Arrays.toString(array1(arr02)));
        // RuntimeException
        // System.out.println(Arrays.toString(array1(arr03)));

        /**
         * task 2
         */

        System.out.println(array2(arr01));
        System.out.println(array2(arr02));
        System.out.println(array2(arr03));
        System.out.println(array2(arr04));

    }


    public static int[] array1(int[] array) {

        int x = 0;
        int[] result = null;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 4) {
                x = array[i];
                result = new int[array.length - 1 - i];
                for (int j = i+1, k = 0; j < array.length; j++, k++) {
                    if (array[j] == 4) continue;
                    result[k] = array[j];
                }
            }
        }
        try {
            x = 1 / x;
        }
        catch (ArithmeticException e) {
            throw new RuntimeException();
        }
        return result;
    }

    public static boolean array2(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 1 && array[i] != 4)
                return false;
        }
        return true;
    }

}
