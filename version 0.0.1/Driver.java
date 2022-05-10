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
            selection.writeArmy();
            
            System.out.println("Would you like to edit any army information?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int editChoice = scanner.nextInt();
            if(editChoice == 1){
                selection.chooseArmy();
                selection.writeArmy();
            }
            else if (editChoice == 2){
                System.out.println("Thanks!");
            }
            else{
                System.out.println("Error in input the pigeons have fled.");
            }

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
        
            BattlePhase fight = new BattlePhase();



            System.out.println("Welcome " + selection.getSubSelection());
            System.out.println("It's good to have  " + selection.getArmyFaction() + " With us in this battle today");
            
            fight.battle();


       
        scanner.close();
    }
}


//TODO: encapsulation

//TODO: Due wed Class diagram, sequence diagram, current code base write release notes.
