package chapter3_task;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String arg[]){
        // You'll ask them how many pennies would you like?
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        // How many nickels would you like?
        System.out.println("How many nickles would you like?");
        int nickles = scanner.nextInt();

        // How many dimes?
        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        //And then, how many quarters?
        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();
        scanner.close();

        int totalCents = pennies + (5 * nickles) + (10 * dimes) + (25 * quarters);


        if(totalCents > 100){
            int difference = totalCents - 100;
            System.out.println("Sorry, you lose! You were over by " + difference + " Cents.");
        }
        else if(totalCents < 100){
            int difference = 100 - totalCents;
            System.out.println("Sorry, you lose! You were short by " + difference + " Cents.");
        }
        else{
            System.out.println("Congrats! You Win.");
        }
    }
}
