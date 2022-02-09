import java.util.Objects;

public class Cat implements Homework8.Runners {

    private String name;
    public static int maximum_run_distance = 200; // максимальное расстояние пробежки кота
    public static int maximum_jump_height = 120; // максимальное расстояние прыжка кота


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
    public void run(int distance) {

        if(distance <= maximum_run_distance) {

            System.out.printf("Кот %s пробежал дорожку в %d метров\n", name, distance);
        }
        else {
            System.out.printf("Для кота %s - это слишком большое расстояние. Длина дорожки - %d\n", name, distance);
        }
    }

    @Override
    public void jump(int height) {

        if(height <= maximum_run_distance) {

            System.out.printf("Кот %s перепрыгнул стену высотой %d см.\n", name, height);
        }
        else {
            System.out.printf("%s - это слишком высоко. Высота стены - %d см. \n", name, height);
        }
    }





}