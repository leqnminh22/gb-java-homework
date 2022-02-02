package ru.mle.homework7;

public class Cat {

    private String name;
    private int appetite;
    protected boolean satiety;


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

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void catInfo(){
        System.out.println("Name: "+name+" appetite: "+ appetite+ " satiety: "+ satiety);
    }

}

