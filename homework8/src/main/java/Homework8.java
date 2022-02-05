import java.util.Random;

public class Homework8 {

    public static Random random = new Random();

    public static void main(String[] args) {

        Obstacle wall = new Wall();
        Obstacle track = new Track();

        Runners[] players = new Runners[6];
        players[0] = new Cat("Mars");
        players[1] = new Robot("Atlas");
        players[2] = new Human("Ares");
        players[3] = new Robot("Jupiter");
        players[4] = new Human("Mike");
        players[5] = new Cat("Fluffy");



        for (int i = 0; i < players.length; i++) {
            players[i].run(track.getLength());{
                for (int j = 0; j < players.length; j++) {
                    players[j].jump(wall.getHeight());
                }
            }
        }
    }


    public interface Runners {
        void run(int distance);

        void jump(int height);
    }

    public interface Obstacle {
        int getLength();

        int getHeight();
    }

    public static class Track implements Obstacle {

        private int trackLength = random.nextInt(250 - 150) + 150;

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

        public int getWallHeight() {
            return wallHeight;
        }

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










