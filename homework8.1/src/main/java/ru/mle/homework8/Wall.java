package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Wall implements Obstacle{
    private static int wallHeight = random.nextInt(301 - 100) + 100;

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return wallHeight;
    }


}

