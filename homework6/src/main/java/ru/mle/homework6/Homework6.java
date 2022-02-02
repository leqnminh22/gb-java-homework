package ru.mle.homework6;

public class Homework6 {

    public static void main(String[] args) {

        Animal cat01 = new Cat("Tom");
        cat01.run(180);
        cat01.swim(213);

        Animal dog01 = new Dog("Doggy");
        dog01.run(499);
        dog01.swim(20);

        Animal cat02 = new Cat("Troy");
        cat02.run(200);
        cat02.swim(10);

        Dog dog02 = new Dog("Shaggy");
        dog02.run(550);
        dog02.swim(5);

        System.out.println();
        System.out.println();
        System.out.println("Было создано " + Cat.counter + " котов");
        System.out.println("Было создано " + Dog.counter + " собак");
        System.out.println("Было создано " + Animal.counter + " животных");
    }
}

abstract class Animal {

    protected int max_run_distance = 0;
    protected int max_swim_distance = 0;

    protected String name;
    public int id;
    static int counter;

    Animal(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public abstract void run(int runDistance);
    public abstract void swim(int swimDistance);

    {
        id = ++counter;
    }
}

class Cat extends Animal {

    public static int counter;

    Cat(String name){

        super(name);
        max_run_distance = 200;
        counter++;
    }

    @Override
    public void run(int runDistance) {

        if(runDistance > max_run_distance)
            System.out.println("Кот устал.");
        else
            System.out.printf("Кот: %s пробежал: %dм.\n",name, runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Коты не умеют плавать.");

    }
}

class Dog extends Animal{

    public static int counter;

    Dog(String name){
        super(name);
        max_run_distance = 500;
        max_swim_distance = 10;
        counter++;

    }

    @Override
    public void run(int runDistance) {

        if(runDistance > max_run_distance)
            System.out.println("Собака устала.");
        else
            System.out.printf("Собака: %s пробежала: %d метров.\n", name, runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        if(swimDistance > max_swim_distance)
            System.out.printf("Собака: %s утонул.\n",name);
        else
            System.out.printf("Собака: %s проплыл: %d метров.\n",name, swimDistance);
    }

    // updated

}

