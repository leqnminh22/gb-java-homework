package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Human implements Runners {

    private String name;
    public int maximum_run_distance = random.nextInt(301 - 100) + 100; // максимальное расстояние пробежки человека
    public static int maximum_jump_height = random.nextInt(301 - 100) + 100; // максимальное высота прыжка человека

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
            System.out.printf("Участник %s не пробежит это расстояние. Длина дорожки: %d. MaxRunDistance: %d.\n",name, distance, maximum_run_distance );
            return false;
        }
        System.out.printf("Участник %s пробежал дорожку. Длина дорожки: %d. MaxRunDistance: %d.\n",name, distance, maximum_run_distance);
        return true;
    }


    @Override
    public boolean jump(int height) {

        if (height > maximum_jump_height) {
            System.out.printf("Участник %s не пробежит это расстояние. Высота препятствия: %d. MaxJumpDistance: %d.\n",name, height, maximum_jump_height);
            return false;
        }
        System.out.printf("Участник %s перепрыгнул препятсвие. Высота препятствия: %d. MaxJumpDistance: %d.\n",name, height, maximum_run_distance);
        return true;
    }
    @Override
    public int getDistance() {
        return maximum_run_distance;

    }

    @Override
    public int getHeight() {
        return maximum_jump_height;
    }


}
