package chapter9_task;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor){
        this.flavor = flavor;
        price = 9.99;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
