package ru.mle.homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task03 {

    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box<>();

        for(int i = 0; i < 3; i++){
            orangeBox1.add(new Orange());
        }

        for(int i = 0; i < 4; i++){
            orangeBox2.add(new Orange());
        }

        for(int i = 0; i < 6; i++){
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orangeBox1weight = orangeBox1.getWeight();
        Float orangeBox2weight = orangeBox2.getWeight();
        Float appleBoxWeight = appleBox.getWeight();

        System.out.println(("Вес коробки 1 с апельсинами: " + orangeBox1weight));
        System.out.println(("Вес коробки 2 с апельсинами: " + orangeBox2weight));
        System.out.println(("Вес коробки с яблоками: " + appleBoxWeight));

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveTo(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

    }

}

abstract class Fruit{

    private float weight;

    Fruit(float weight){
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit{

    Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "яблоки";
    }
}

class Orange extends Fruit{
    Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return "апельсины";
    }
}

class Box<T extends Fruit> {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box(T obj) {
        list = Arrays.asList(obj);
    }

    public Box(){
        list = new ArrayList<>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveTo(Box<T> box){
        box.getList().addAll(list);
        list.clear();
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        }
        else{
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }

    float getWeight(){
        if (list.isEmpty())
            return 0;
        else
            return list.size() * list.get(0).getWeight();
    }

    boolean compare (Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}