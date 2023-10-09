package project;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is the name of the 1st player?");

        Player player1 = new Player(scanner.nextLine());
        player1.setGuess(askGuess());

        System.out.println("What is the name of the 2nd player?");
        Player player2 = new Player(scanner.nextLine());

        if(player1.getGuess().equals(Coin.HEADS) ){
            player2.setGuess(Coin.TAILS);
        }
        else {
            player2.setGuess(Coin.HEADS);
        }

        System.out.println("Flipping the coin.....");
        Coin coin = new Coin();
        coin.flip();
        determineWinner(player1, player2, coin.getSide());
        scanner.close();
    }

    public static String askGuess(){
        System.out.println(Coin.HEADS + " Or " + Coin.TAILS + "?");
        String guess = scanner.nextLine();

        while (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid guess. Try again."
                    + Coin.HEADS + " Or " + Coin.TAILS + "?" );
            guess = scanner.nextLine();
        }

        if(guess.equalsIgnoreCase(Coin.HEADS)){
            return Coin.HEADS;
        }else {
            return Coin.TAILS;
        }
    }

    public static void determineWinner(Player player1, Player player2, String coinSide){
        System.out.println("The coin landed on " + coinSide);
        String winner;

        if(player1.getGuess().equals(coinSide)){
            winner = player1.getName();
        }
        else {
            winner = player2.getName();
        }

        System.out.println("The winner is " + winner);

    }

}
