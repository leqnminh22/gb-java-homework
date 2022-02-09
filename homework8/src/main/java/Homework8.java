import java.util.Random;

public class Homework8 {

    public static Random random = new Random();

    public static void main(String[] args) {

        Obstacle track = new Track();
        track.getLength();
        Obstacle wall = new Wall();
        wall.getHeight();

        Obstacle[] obstacles = {track, wall};

        Runners runners01 = new Cat("Mars");
        Runners runners02 = new Robot("Atlas");
        Runners runners03 = new Robot("Boris");
        Runners runners04 = new Human("Jupiter");
        Runners runners05 = new Human("Mike");
        Runners runners06 = new Cat("Fluffy");

        Runners[] runners = {runners01, runners02, runners03, runners04, runners05, runners06};

        for (int i = 0; i < runners.length; i++) {
            runners[i].getOverObstacles(obstacles);
        }
    }


    public interface Runners {
        void run(int distance);

        void jump(int height);

        default void getOverObstacles(Obstacle[] obstacle){
            int trackLength = random.nextInt(250 - 150) + 150; // Рандомим длину дорожки
            int wallHeight = random.nextInt(200 - 100) + 100; // Рандомим высоту стены

                run(trackLength);
                jump(wallHeight);

        }
    }

    public interface Obstacle {
        int getLength();

        int getHeight();
    }

    public static class Track implements Obstacle {

        private int trackLength = 400;

        public int getTrackLength() {
            return trackLength;
        }

        public void setTrackLength(int trackLength) {
            this.trackLength = trackLength;
        }

        @Override
        public int getLength() {
            return trackLength;
        }

        @Override
        public int getHeight() {
            return 0;
        }

    }

    public static class Wall implements Obstacle {

        private int wallHeight = random.nextInt(200 - 100) + 100;

        public void setWallHeight(int wallHeight) {
            this.wallHeight = wallHeight;
        }

        @Override
        public int getLength() {
            return 0;
        }

        @Override
        public int getHeight() {
            return wallHeight;
        }
    }
}










