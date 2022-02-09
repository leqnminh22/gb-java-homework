package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Robot implements Runners {

    private String name;

    public int maximum_run_distance = random.nextInt(301 - 100) + 100; // максимальное расстояние пробежки робота
    public static int maximum_jump_height = random.nextInt(301 - 100) + 100; // максимальное высота прыжка робота

    public Robot(String name) {
        this.name = name;
    }


    @Override
    public boolean run(int distance) {

        if (distance > maximum_run_distance) {
            System.out.printf("Робот %s не пробежит это расстояние. Длина дорожки: %d. MaxRunDistance: %d.\n",name, distance, maximum_run_distance );
            return false;
        }
        System.out.printf("Робот %s пробежал дорожку. Длина дорожки: %d. MaxRunDistance: %d.\n",name, distance, maximum_run_distance);
        return true;
    }


    @Override
    public boolean jump(int height) {

        if (height > maximum_jump_height) {
            System.out.printf("Робот %s не перепрыгнет препятствие. Высота препятствия: %d. MaxJumpDistance: %d.\n",name, height, maximum_jump_height);
            return false;
        }
        System.out.printf("Робот %s перепрыгнул препятсвие. Высота препятствия: %d. MaxJumpDistance: %d.\n",name, height, maximum_run_distance);
        return true;
    }




}
