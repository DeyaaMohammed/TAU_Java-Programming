package chapter6_task;

public class PhoneBillCalculator {
    public static void main(String[] args) {

        PhoneBill bill = new PhoneBill(123);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
