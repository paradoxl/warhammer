import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Dice {
    public void dSix() {
        final SecureRandom randomNumbers = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
       int totalDice = 0;

        System.out.println("please choose an ammount of dice to roll");

        
        
                int numberOfRolls = scanner.nextInt();

                for (int i = 1; i < numberOfRolls+1; i++) {
                    int die = 1 + randomNumbers.nextInt(6);
                    System.out.println("Roll " + i + ": " + die);
                    totalDice = totalDice + die;
                }
                System.out.println("Total roll: " + totalDice);
            

            

        
        //scanner.close();
    }
}
