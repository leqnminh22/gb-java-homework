package ru.mle.homework7;

import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

        public int getAppetite(){
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Random random = new Random();

    public void eat(Plate p) {
        // Удаляем еду из миски в соответствии с аппетитом кота
        if (p.decreaseFood(this.appetite)) { // Еды оказалось достаточно
            System.out.println(this.name + " покушал в соответствии со своим аппетитом " + this.appetite);
            // Кот насытился
            this.satiety = true;
        } else { // Еды оказалось недостаточно
            // п.4 Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
            // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
            System.out.println(this.name + " не будет есть эти крошки. Еды не хватило.");
            p.increaseFood(random.nextInt(50) + 10);
            eat(p);
        }
    }

    public void catInfo(){
        System.out.println("Name: "+name+" appetite: "+ appetite+ " satiety: "+ satiety);
    }

}

