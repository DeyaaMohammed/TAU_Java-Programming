package chapter10_task;

public class Market {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple)apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Fruit banana = new Banana();
        ((Banana)banana).peel();

        Banana banana2 = new Banana();
        banana2.peel();

        Fruit strawberry = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(strawberry);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing....");
        fruit.makeJuice();
    }
}
