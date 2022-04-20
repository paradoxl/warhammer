import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        login log = new login();
        ArmyFaction selection = new ArmyFaction();
        log.loginMenu();
        selection.chooseArmy();
        System.out.println(selection.getArmyFaction());

        // System.out.println("Thanks for selecting your army");
        // System.out.println("How many dice would you like to roll?");
        // //int diceResponse = scanner.nextInt();

    }
}
