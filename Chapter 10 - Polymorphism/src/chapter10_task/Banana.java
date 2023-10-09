package chapter10_task;

public class Banana extends Fruit {

    public Banana(){
        setCalories(100);
    }

    public void peel(){
        System.out.println("Banana has been peeled.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made.");
    }
}
