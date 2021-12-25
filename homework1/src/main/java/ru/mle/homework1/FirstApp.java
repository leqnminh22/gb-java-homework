package ru.mle.homework1;

public class FirstApp {

    // задание 1. Прописать метод main()

    public static void main(String[] args) {

        // задание 2

        byte byteVal = 120;
        short shortVal = 10000;
        int intVal = 1234;
        long longVal = 10000L;
        float floatVal = 32.22f;
        double doubleVal = 12.12;
        boolean booleanVal = true;
        char charVal1 = 0, charVal2 = '\u2222';

        // задание 3
        float a = 2.1f;
        float b = 4.2f;
        float c = 6.2f;
        float d = 8.1f;

        float res = calculate(a, b, c, d);
        System.out.println("Результат выражения = " + res);
        System.out.printf("%s%.2f * (%.2f + (%.2f / %.2f)) = %.2f\n", "Результат, округленный\n", a, b, c, d, res);

        // задание 4
        System.out.println(check10to20(20, 6));

        // задание 5
        positiveOrNegative(-100);

        // задание 6
        System.out.println(ifPositiveOrNegative(-100));

        // задание 7
        Hello("Maria");

        // задание 8

        leapOrNot(1900);



    }


    /**
     * 3. Метод вычисления выражения a * (b + (c / d))
     * @param x число
     * @param y число
     * @param z число
     * @param q число
     * @return Результат выражения
     */

    public static float calculate(float x, float y, float z, float q) {

        return x * (y + (z / q));
    }



    // 4. Метод, проверяющий, что целое число находится в пределах интервала от 10 до 20

    public static int sum(int x, int y) {
        return x + y;

    }

    public static boolean check10to20(int x, int y) {
        return sum(x, y) >= 10 && x + y <= 20;

    }

    // 5. Метод, в котором передается целое число и определяется положительное или отрицательное число

    public static void positiveOrNegative(int x) {
        if (x >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }

    // 6. Метод должен вернуть true, если отрицательное; false - положительное

    public static boolean ifPositiveOrNegative(int x) {
        return x < 0;

    }
    /**
     * 7. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     * @param x имя
     */


    public static void Hello(String x) {
        System.out.println("Привет, " + x + "!");

    }

    /**
     * 8. Метод определяющий високосный год или нет
     * @param year год
     */
    public static void leapOrNot(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && (year % 100 != 0))){
            System.out.println(year +" is leap");
        }
        else {
            System.out.println(year + " is normal year");
        }

// на проверку
    }

}



