import java.util.Scanner;

public class ArmyFaction{
    public void chooseArmy(){
        SubFactionSM SM = new SubFactionSM();
        System.out.println("Please select an army below");
        System.out.println("1: Space marines");
        System.out.println("2: chaos space marines");
        System.out.println("3: orks");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        switch (selection){
            case 1:
                SM.SubSelection();
                break;
            case 2:
                // branch Chaos
                break;
            case 3: 
                //branch orks
                break;
            default:
                System.out.println("there was an error in your selection");
        }
            scanner.close();
    }
}