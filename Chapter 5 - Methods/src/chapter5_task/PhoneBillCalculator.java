package chapter5_task;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String args[]){

        System.out.println("Enter base cost of the plan:");
        Scanner scanner = new Scanner(System.in);
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int numberOfOverageMinutes = scanner.nextInt();
        scanner.close();

        double overage = calculateOverageFees(numberOfOverageMinutes);
        double tax = calculateTax(planFee, overage);

        caculateAndPrintBill(planFee, overage, tax);
    }

    public static double calculateOverageFees(int numberOfOverageMinutes){
        return numberOfOverageMinutes * 0.25;
    }

    public static double calculateTax(double planFee, double overage){
        return 0.15 * (planFee + overage) ;
    }

    public static void caculateAndPrintBill(double planFee, double overage, double tax){
        double finalBill = planFee + overage + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalBill));
    }
}
