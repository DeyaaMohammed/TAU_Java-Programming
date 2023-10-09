package chapter9_task;

public class WeddingCake extends Cake {
    private int tiers;
    WeddingCake(){
        super("Vanilla");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
