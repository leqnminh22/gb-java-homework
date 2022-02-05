public class Robot implements Homework8.Runners {

    private String name;

    private int maximum_run_distance = 250; // максимальное расстояние пробежки робота
    private int maximum_jump_height = 200; // максимальное расстояние прыжка робота

    public Robot(String name){
        this.name = name;    }



    @Override
    public void run(int distance) {
        if(distance <= maximum_run_distance) {

            System.out.printf("Робот %s пробежал дорожку в %d метров\n", name, distance);
        }
        else {
            System.out.printf("Для Робот %s - это слишком большое расстояние. Длина дорожки - %d\n", name, distance);
        }

    }

    @Override
    public void jump(int height) {

        if(height <= maximum_jump_height) {

            System.out.printf("Робот %s перепрыгнул стену высотой %d см.\n", name, height);
        }
        else {
            System.out.printf("%s - это слишком высоко. Высота стены - %d см. \n",name,height);
        }

    }
}
