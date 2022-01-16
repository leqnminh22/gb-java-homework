package ru.mle.homework3;

import java.util.Scanner;

public class lesson3 {

    public static void taks1() {
        System.out.println("Подсчет суммы нечетных положительных чисел");
        System.out.println("==========================================");
        System.out.println("Вводите целые числа (0 - завершение ввода");


        int number = 0;
        int sum = 0;
        boolean isNumber;
        int counter = 0;

        do {
            counter++;
            System.out.println("Введите число: ");
            isNumber = scanner.hasNextInt();
            if(isNumber) {
                number = scanner.nextInt();
                scanner.nextLine();
                if(!isEven(number) && number > 0)
                sum += number;

            }
            else {
                System.out.println("Вы ввели некорректное число,\n повторите ввод");
                scanner.nextLine(); // отчищаем от зацикливания (сжираем \n)
            }

        }
        while (!(isNumber && number == 0));

        System.out.printf("Сумма нечетных положительных чисел: %d\nКол-во попыток ввода: %d\n", sum, counter - 1);
        System.out.println("Завершение работы подпрограммы.");
    }

    public static void taks2() {
        System.out.println("Task process 2");
    }

    public static void taks3() {
        System.out.println("Task process 3");
    }

    static Scanner scanner = new Scanner(System.in);

    static boolean isEven (int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        boolean f = true;
        while (f) {

            System.out.println("1 - Подсчет суммы нечетных положительных чисел");
            System.out.println("2 - task 2");
            System.out.println("3 - task 3");
            System.out.print("Введите номер задачи\n(0 - завершение работы приложения): ");


            if (scanner.hasNextInt()) {

                int no = scanner.nextInt();
                scanner.nextLine();
                switch (no) {
                    case 1:
                        taks1();
                        break;

                    case 2:
                        taks2();
                        break;

                    case 3:
                        taks3();
                        break;

                    case 0:
                        f = false;
                        System.out.println("Завершение работы приложения");
                        scanner.close();
                        break;

                    default:
                        System.err.println("Вы ввели несуществующий номер задачи.");
                }

            } else {
                System.out.println("Вы ввели некорректный номер задачи, пожалуйста, повторите ввод.");
                scanner.nextLine();

            }
        }
    }
}


