package ru.mle.homework8;

import static ru.mle.homework8.Homework8.random;

public class Track implements Obstacle {
    private int trackLength = random.nextInt(301 - 100) + 100;


    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public int getLength() {
        return trackLength;    }


    @Override
    public int getHeight() {
        return 0;
    }

}
