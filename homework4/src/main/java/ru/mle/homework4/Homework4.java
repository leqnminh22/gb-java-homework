package ru.mle.homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';
    static final char DOT_EMPTY = '•';
    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();
    static char[][] field;
    static final int fieldSizeX = 3;
    static final int fieldSizeY = 3;

    /**
     * Инициализация объектов игры
     */
    static void initialize() {
        // Инициализация массива, описывающее игровое поле
        field = new char[fieldSizeX][fieldSizeY];
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.println(i + 1 + "|");
            for (int j = 0; j < fieldSizeY; j++) {
                System.out.println(field[i][j] + "|");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        initialize();
        printField();
    }
}