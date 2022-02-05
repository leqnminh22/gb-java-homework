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
        if(food >= 0) {
            this.food = food;
        }
        else {
            System.out.println("Еда закончилась.");
        }
    }

    /**
     * Удаление еды из тарелки
     * @param amount - кол-во еды (в условных единицах)
     * @return - если в тарелке, после удаления, остается достаточно еды, возвращаем результат операции true,
     * в противном случае, не удаляем еду, возвращаем результат операции false
     */
    public boolean decreaseFood(int amount) {
        if (this.food < amount) {
            System.out.println("Недостаточно еды для ее удаления");
            return false;
        }
        this.food -= amount;
        System.out.printf("Удалено %d еды из тарелки, теперь в тарелке %d еды\n", amount, food);
        return true;
    }

    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int x){
        food += x;
    }

    public void info(){
        System.out.println("plate: "+ food);
    }

}
