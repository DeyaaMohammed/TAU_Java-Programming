package project;

import java.util.Random;

public class Coin {
    private String side;
    public static final String HEADS = "Heads";
    public static final String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip(){
        if(new Random().nextBoolean()){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }
    }
}
