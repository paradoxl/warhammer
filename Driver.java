import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Gameplay start = new Gameplay();

            System.out.println("Are you ready to head to the front lines astartes?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int choice = scanner.nextInt();

            if (choice == 1){
                start.playGame();
            }
            if (choice == 2){
                System.out.println("Maybe next time the legion will send us someone of value.");
            }

            

        
    }
}