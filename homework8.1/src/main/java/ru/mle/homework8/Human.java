package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Human implements Runners {

    private String name;
    public int maximum_run_distance = 250;; // максимальное расстояние пробежки человека
    public static int maximum_jump_height = 1; // максимальное высота прыжка человека

    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int distance) {

        if (distance > maximum_run_distance) {
            System.out.printf("Для человека %s - это слишком большое расстояние. Длина дорожки - %d\n", name, distance);
            return false;
        }
        System.out.printf("Человек %s пробежал дорожку в %d метров\n", name, distance);
        return true;
    }


    @Override
    public boolean jump(int height) {

        if (height > maximum_jump_height) {
            System.out.printf("%s - это слишком высоко. Высота стены - %d см. \n", name, height);
            return false;
        }
        System.out.printf("Человек %s перепрыгнул стену высотой %d см.\n", name, height);
        return true;
    }

}
