package chapter6_task;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 69.99;
        allottedMinutes = 600;
        minutesUsed = 600;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 69.99;
        allottedMinutes = 600;
        minutesUsed = 600;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageFees(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }
    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverageFees()) ;
    }

    public double calculateTotal(){
        return baseCost + calculateOverageFees() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + String.format("%.2f", baseCost));
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverageFees()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }

}
