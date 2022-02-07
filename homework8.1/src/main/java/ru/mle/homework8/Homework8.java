package ru.mle.homework8;

import java.util.Random;

public class Homework8 {
    public static Random random = new Random();

    public static void main(String[] args) {

        Obstacle track01 = new Track();
        int x = track01.getLength();
        Obstacle wall01 = new Wall();
        int y = wall01.getHeight();


        Obstacle[] obstacles = {track01, wall01};

        Runners runners01 = new Cat("Барсик");
        Runners runners02 = new Robot("Альфа");
        Runners runners03 = new Robot("Прайм");
        Runners runners04 = new Human("Максим");
        Runners runners05 = new Human("Евгения");
        Runners runners06 = new Cat("Пушок");

        Runners[] runners = {runners01, runners02, runners03, runners04, runners05, runners06};

        for (Runners r: runners){
            if (x < r.getDistance()) {
                r.run(x);
                r.jump(y);
                System.out.println();
            }
            else {
                System.out.printf("Участник не сможет учавствовать в забеге.\n");
                System.out.println();
            }


        }

    }

}

