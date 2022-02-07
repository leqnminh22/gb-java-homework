package ru.mle.homework8;

import java.util.Random;

public class Homework8 {
    public static Random random = new Random();

    public static void main(String[] args) {

        Obstacle track01 = new Track();
        Obstacle wall01 = new Wall();


        Obstacle[] obstacles = {track01, wall01};

        Runners runners01 = new Cat("Mars");
        Runners runners02 = new Robot("Atlas");
        Runners runners03 = new Robot("Boris");
        Runners runners04 = new Human("Jupiter");
        Runners runners05 = new Human("Mike");
        Runners runners06 = new Cat("Fluffy");

        Runners[] runners = {runners01, runners02, runners03, runners04, runners05, runners06};

        for (Runners a : runners) {
            a.jump(250);
            a.run(252);
        }
    }

}

