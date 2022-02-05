package ru.mle.homework7;

import java.util.Locale;
import java.util.Scanner;

public class Homework7 {

    /*
    1. Расширить задачу про котов и тарелки с едой.
    2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    3 .Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
    4 .Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
    6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

    */
    private static int time = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Пушок", 40);
        cats[1] = new Cat("Снежок", 50);
        cats[2] = new Cat("Муся", 60);
        cats[3] = new Cat("Женя", 150);

        Plate plate = new Plate(10);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        plate.info();

        // Добавить еду
        System.out.println("Добавить вискас в тарелку: ");
        int add;
        add = scanner.nextInt();
        plate.increaseFood(add);
        plate.info();

    }
}

