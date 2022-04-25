import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login log = new login();
        ArmyFaction selection = new ArmyFaction();
        log.loginMenu();

        //army selection and display
        selection.chooseArmy();
        System.out.println("Your army is as follows:");
        System.out.println("Army: " + selection.getArmyFaction());
        
        System.out.println("Sub Faction: " + selection.getSubSelection());

    //     System.out.println("Thanks for selecting your army");
    //     System.out.println("How many dice would you like to roll?");
    //     int diceResponse = scanner.nextInt();

    //    // dice(diceResponse);

    }
}
