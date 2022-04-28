import java.util.Scanner;

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

        dice.dSix();
       
        scanner.close();
    }
}
