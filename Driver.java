import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login log = new login();
        ArmyFaction selection = new ArmyFaction();
        Dice dice = new Dice();
        log.loginMenu();

        // army selection and display
        selection.chooseArmy();
        System.out.println("Your army is as follows:");
        System.out.println("Army: " + selection.getArmyFaction());

        System.out.println("Sub Faction: " + selection.getSubSelection());

        System.out.println("Thanks for selecting your army");
            selection.writeArmy();
            
            try {
                System.out.println("Saving in progress");
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println("Saving complete");
            } catch (Exception e) {
                System.out.println("Error");
            }
            
        


        dice.dSix();
       
        scanner.close();
    }
}
