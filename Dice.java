import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class Dice {
    public void dSix() {
        final SecureRandom randomNumbers = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("please choose an ammount of dice to roll");

        
            try {
                int numberOfRolls = scanner.nextInt();

                for (int i = 1; i < numberOfRolls+1; i++) {
                    int die1 = randomNumbers.nextInt(6);
                    System.out.println("Roll " + i + " : " + die1);
                }
            } catch (java.util.NoSuchElementException e) {
                System.out.println("error in retreiving rolls");
            }

            

        
        scanner.close();
    }
}
