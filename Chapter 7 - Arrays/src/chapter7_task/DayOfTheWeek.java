package chapter7_task;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = scanner.nextInt();

        if(index > 0 && index < 8){
            System.out.println("Corresponding day: " + week[index - 1]);
        }
        else
            System.out.println("Invalid Input!");
    }
}
