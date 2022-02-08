package ru.mle.homework9;

import java.io.IOException;
import java.io.PrintWriter;

public class Homework9 {


    public static void main(String[] args) {

        String[][] correctEx = {{"1","4","3","7"}, {"1","3","3","2"}, {"2","2","2","7"}, {"5","6","3","4"}};
        String[][] wrongSizeEx = {{"1","4","3","7"}, {"1","3","3","2"}, {"2","2","2","7"}, {"5","6","3","4"}, {"1","2","3","4"}};
        String[][] wrongCharEx = {{"1","4","3","7"}, {"1","0","3","2"}, {"A","2","2","7"}, {"5","6","3","4"}};

        try {
            int result = strArray(correctEx);
            System.out.printf("Сумма всех элементов массива равна [%s].\n", result);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n***********\n");

        try {
            int result = strArray(wrongSizeEx);
            System.out.printf("Сумма всех элементов массива равна [%s].\n", result);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("***********\n");

        try {
            int result = strArray(wrongCharEx);
            System.out.printf("Сумма всех элементов массива равна [%s].\n", result);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int strArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}

