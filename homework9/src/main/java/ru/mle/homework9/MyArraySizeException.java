package ru.mle.homework9;

public class MyArraySizeException extends Exception{
    MyArraySizeException(){
        super("Размер массива превышен!\n");
    }
}
