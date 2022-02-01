package ru.mle.homework6;

public class Homework6 {

    public static void main(String[] args) {

        Animal cat01 = new Cat("Tom");
        cat01.run(180);
        cat01.swim(213);

        Animal dog01 = new Dog("Doggy");
        dog01.run(499);
        dog01.swim(20);

        Dog dog02 = new Dog("Shaggy");
        dog02.run(550);
        dog02.swim(5);

        Animal cat02 = new Cat("Troy");
        cat02.run(200);
        cat02.swim(10);

        System.out.println();

        System.out.println("Количество животных: "+ Animal.counter);
    }
}

abstract class Animal {

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

    Cat(String name){
        super(name);
    }

    @Override
    public void run(int runDistance) {

        if(runDistance > 200)
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

    Dog(String name){
        super(name);

    }

    @Override
    public void run(int runDistance) {

        if(runDistance > 500)
            System.out.println("Собака устала.");
        else
            System.out.printf("Собака: %s пробежала: %d метров.\n", name, runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        if(swimDistance > 10)
            System.out.printf("Собака: %s утонул.\n",name);
        else
        System.out.printf("Собака: %s проплыл: %d метров.\n",name, swimDistance);
    }

}

