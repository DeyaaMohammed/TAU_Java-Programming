package chapter4_task;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]){
        Random random = new Random();
        int spaces = 20;
        int score = 0;

        for(int i = 0; i < 5 ; i++){
            int die = random.nextInt(6) + 1;
            score += die;

            if(score == spaces){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die +
                        ". You're on space 20. Congrats, you win!");
                break;
            }
            else if(score > spaces){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die +
                        ". Unfortunately, that takes you past " + spaces + " spaces. You lose!");
                break;
            }
            else if(score < spaces && i == 4){
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You're on space " + score + ".");
                System.out.println("Unfortunately, you didn't make it to all " + spaces + " spaces. You lose!");
            }
            else{
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die +
                        ". You are now on space " + score + " and have " + (spaces - score) + " more to go.");

            }
        }
    }
}
