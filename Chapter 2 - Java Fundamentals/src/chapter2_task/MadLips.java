package chapter2_task;

import java.util.Scanner;

public class MadLips {
    public static void main (String arg[]){
        //1. Ask for season of the year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask for a whole number
        System.out.println("Enter a whole number:");
        int wholeNumber = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        //4. Print out this sentence
        //"On a [adjective] [season of the year] day, I drink minimum of [whole number] cups of coffee."
        System.out.println("On a "+ adjective + " " + season + " day, I drink minimum of " + wholeNumber + " cups of coffee.");
    }
}
