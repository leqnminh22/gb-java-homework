package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Robot implements Runners {

    private String name;

    public int maximum_run_distance = 300;; // максимальное расстояние пробежки робота
    public static int maximum_jump_height = 2; // максимальное высота прыжка робота

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public boolean run(int distance) {

        if (distance > maximum_run_distance) {
            System.out.printf("Для робота %s - это слишком большое расстояние. Длина дорожки - %d\n", name, distance);
            return false;
        }
        System.out.printf("Робот %s пробежал дорожку в %d метров\n", name, distance);
        return true;
    }


    @Override
    public boolean jump(int height) {

        if (height > maximum_jump_height) {
            System.out.printf("%s - это слишком высоко. Высота стены - %d см. \n", name, height);
            return false;
        }
        System.out.printf("Робот %s перепрыгнул стену высотой %d см.\n", name, height);
        return true;
    }

}
