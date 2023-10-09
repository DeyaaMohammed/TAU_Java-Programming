package chapter11_task;

public class Farm {

    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.makeSound();

        Duck duck = new Duck();
        duck.makeSound();

        Pig pig = new Pig();
        pig.makeSound();
    }
}
