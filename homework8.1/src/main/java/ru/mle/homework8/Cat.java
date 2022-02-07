package ru.mle.homework8;

import java.util.Random;

public class Cat implements Runners {

    private String name;
    Random random = new Random();
    public int maximum_run_distance = 200; // максимальное расстояние пробежки кота
    public int maximum_jump_height = 3; // максимальное высота прыжка кота


    public Cat(String name) {
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

        if(distance > maximum_run_distance) {
            System.out.printf("Для кота %s - это слишком большое расстояние. Длина дорожки - %d\n", name, distance);
            return false;
        }
        System.out.printf("Кот %s пробежал дорожку в %d метров\n", name, distance);
        return true;
        }


    @Override
    public boolean jump(int height) {

        if(height > maximum_jump_height) {
            System.out.printf("%s - это слишком высоко. Высота стены - %d см. \n", name, height);
            return false;
        }
        System.out.printf("Кот %s перепрыгнул стену высотой %d см.\n", name, height);
        return true;
        }

//    @Override
//    public void getOverObstacles(Obstacle[] obstacle) {
//        run();
//        jump();
//    }


}


