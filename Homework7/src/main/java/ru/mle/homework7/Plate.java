package ru.mle.homework7;


public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        food -= n;
    }

    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int x){
        food += x;
    }

    public void info(){
        System.out.println("plate: "+ food);
    }

}
