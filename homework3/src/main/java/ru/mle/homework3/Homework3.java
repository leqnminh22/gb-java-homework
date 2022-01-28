package ru.mle.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//check

public class Homework3 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // 1. Угадать число
//        guessNumber();
//        sc.close();

        // 2. Угадать слово
        guessWord();

    }

    // Угадать число от 0 до 9
    public static void guessNumber() {
        int counter = 0;
        boolean isNumber;
        int number = (int) (Math.random() * 9);
        int input_number = 0;

        System.out.println("Угайдайте число от 0 до 9");
        System.out.println("У вас есть 3 попытки.");

        do {
            counter++;
            System.out.println("Введите число");
            isNumber = sc.hasNextInt();
            if (isNumber) {
                input_number = sc.nextInt();
                sc.nextLine();
                if (input_number == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (input_number > number) System.out.println("Загаданное число меньше.");
                else System.out.println("Загаданное число больше.");
            } else {
                System.err.println("Введите целое число.");
                sc.nextLine();
            }
        }
        while (counter < 3);
        if (input_number != number)
            System.out.printf("Вы проиграли!\nИспользовано попыток: %s. Игра закончилась.\n", counter);
        if (input_number == number) System.out.printf("Использовано попыток: %s. Игра закончилась.\n", counter);

        boolean x = true;
        while (x) {
            System.out.println("Сыграть еще раз? 1 - да / 0 - нет");

            if (sc.hasNextInt()) {
                int playAgain = sc.nextInt();
                sc.nextLine();
                switch (playAgain) {
                    case 1:
                        guessNumber();
                        break;

                    case 0:
                        x = false;
                        System.out.println("Завершение игры. До встречи!");
                        break;

                    default:
                        System.err.println("Вы ввели некорректную операцию, пожалуйста, повторите ввод.");
                }
            }

        }
    }

    // Угадать слово
    public static void guessWord() {
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int n = random.nextInt(words.length);
        System.out.println(n);
        System.out.println("Программа загадала слово, попробуйте угадать.");
        char[] x = words[n].toCharArray(); // создаем массив из букв, загаданного слова, чтобы узнать длину
        char[] xConvert = new char[x.length]; // меняем индексы загаданного слова на "*"
        for (int i = 0; i < x.length; i++) {
            xConvert[i] = '*';
        }
        while(true) {
            System.out.println("Введите слово (0 - выход из программы)");
            word = sc.nextLine();
            if(word.equals("0")){
                break;
            }
            if(word.equals(words[n])){
                System.out.println("Вы угадали!");
            }else {
                System.out.println("Вы не угадали");
                char[] aWord = word.toCharArray(); // создаем массив, введенного игроком, слова
                for (int i = 0; i < x.length; i++) {
                    if(i >= aWord.length){
                        break;
                    }
                    if(x[i] == aWord[i]){
                        xConvert[i] = x[i];
                    }
                }
                System.out.println(String.valueOf(xConvert));
            }
        }
    }
}