import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Dice {
    private int hitDie;
    public int healthCounter = 100;
    public void rollForHit() {
        final SecureRandom rando = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please roll for hit chance.");
        System.out.println("Please press 1 to roll");
        int nextRoll = scanner.nextInt();

        if (nextRoll == 1) {

             hitDie = 1 + rando.nextInt(20);
        }

    }

    public void setHitDie(int hitDie){
        this.hitDie = hitDie;
    }
    public int getHitDie(){
        return hitDie;
    }

    public void dSix() {
        final SecureRandom randomNumbers = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        int totalDice = 0;
       

        System.out.println("please choose an ammount of dice to roll");

        int numberOfRolls = scanner.nextInt();

        for (int i = 1; i < numberOfRolls + 1; i++) {
            int die = 1 + randomNumbers.nextInt(6);
            System.out.println("Roll " + i + ": " + die);
            totalDice = totalDice + die;
            healthCounter = healthCounter - totalDice;
        }
        System.out.println("Total roll: " + totalDice);

        if(totalDice > 25){
            System.out.println("Huge hit! you've done some major damage! The boss now has " + healthCounter + "Hp left" );
        }
        else{
            System.out.println("You hit! the boss now has " + healthCounter + "HP left");
        }

        // scanner.close();
    }
}
