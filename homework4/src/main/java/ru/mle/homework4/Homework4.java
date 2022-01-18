package ru.mle.homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '•';
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[][] map;
    static final int SIZE = 3;
    static final int WIN_COUNT = 3;

    /**
     * Инициализация объектов игры
     */
    static void initialize() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * Вывод игрового поля
     */
    static void printMap() {
        System.out.print("+");
        for (int i = 0; i < SIZE * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
     * Обработка хода игрока
     */
    static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты хода через пробел");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) && !isCellEmpty(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Обработка хода компьютера
     */
    static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y) && !isCellEmpty(x, y));
        map[x][y] = DOT_O;
    }

    /**
     * Проверка пустая ли ячейка DOT_EMPTY
     * @param x коордианата хода
     * @param y коордианата хода
     * @return
     */
    static boolean isCellEmpty(int x, int y) {
        return map[x][y] == DOT_EMPTY;
    }

    /**
     * Проверка валидности хода
     * @param x координата хода
     * @param y координата хода
     * @return
     */
    static boolean isCellValid(int x, int y) {
        return x > 0 && x <= SIZE && y > 0 && y <= SIZE;
    }

    /**
     * Проверка на победу
     * @param c
     * @return
     */
    static boolean checkWin(char c) {
        // проверка по горизонтали
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c) return true;
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) return true;
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) return true;

        // проверка по вертикали
        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) return true;
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) return true;
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) return true;

        // проверка по диагонали
        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) return true;
        if (map[2][0] == c && map[1][1] == c && map[0][2] == c) return true;

        return false;
    }

    static boolean check(int x, int y, char c, int winCount){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = c *
            }

        }
    }

    /**
     *Проверка на ничью
     * @return
     */
    static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                if (isCellEmpty(i, j))
                    return false;
        }
        return true;
    }

    /**
     * Проверка состояния игры, вызывается каждый раз когда совершается ход игрока и компютера
     * true - завершение игры
     * @param dot
     * @param s
     * @return
     */
    static boolean gameCheck(char dot, String s) {

        // Проверка победы игрока или компьютера
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        }
        //Проверка на ничью
        if (checkDraw()) {
            System.out.println("Ничья");
            return true;
        }
        // Продолжаем игру.
        return false;
    }

    public static void main(String[] args) {
        do {
            initialize();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (gameCheck(DOT_X, "Вы победили!"))
                    break;
                aiTurn();
                printMap();
                if (gameCheck(DOT_O, "Вы проиграли!"))
                    break;
            }
            System.out.println("Хотите сыграть еще раз? Y - Да");
        } while (scanner.next().equalsIgnoreCase("Y"));
    }
}






