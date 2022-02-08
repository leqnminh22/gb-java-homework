package ru.mle.homework9;

public class MyArrayDataException extends Exception{

    public int row, col;

    MyArrayDataException(int row, int col) {

        super(String.format("Неправильное значение массива!\nНеверные данные находятся в ячейке [%d, %d]\n", row, col));

    }

}
