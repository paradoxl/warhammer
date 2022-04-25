import java.util.Scanner;

public class ArmyFaction {
    Scanner scanner = new Scanner(System.in);
    private String armySelection;
    private String subSelection;

    public void chooseArmy() {
        System.out.println("Please select an army below");
        System.out.println("1: Space marines");
        System.out.println("2: chaos space marines");
        System.out.println("3: orks");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                SMSubSelection();
                armySelection = "Space Marines";
                break;
            case 2:
                ChaosSubSelection();
                armySelection = "Chaos Space Marines";
                break;
            case 3:
                OrkSelection();
                armySelection = "Ork";
                break;
            default:
                System.out.println("there was an error in your selection");
        }
        scanner.close();
    }


    public void SMSubSelection() {
        System.out.println("Please choose a subfaction");
        System.out.println("1: UltraMarines");
        System.out.println("2: Dark Angels");
        System.out.println("3: Space wolves");

        int subResponse = scanner.nextInt();
        switch (subResponse) {
            case 1:
                // branch ultramarine
                subSelection = "Ultra-Marines";
                break;
            case 2:
                // branch Dark Angels
                subSelection = "Dark Angels";
                break;
            case 3:
                // branch Space wolves
                subSelection = "Space Wolves";
                break;
            default:
                System.out.println("there was an error in your selection");

        }

    }

    public void ChaosSubSelection() {
        System.out.println("Please choose a subfaction");
        System.out.println("1: Death Guard");
        System.out.println("2: Thousand sons");
        System.out.println("3: Night Lords");

        int subResponse = scanner.nextInt();
        switch (subResponse) {
            case 1:
                // branch death guard
                subSelection = "Death Guard";
                break;
            case 2:
                // branch thousand sons
                subSelection = "Thousand Sons";
                break;
            case 3:
                // branch night lords
                subSelection = "Night Lords";
                break;
            default:
                System.out.println("there was an error with your selection");
        }

    }

    public void OrkSelection() {
        System.out.println("please choose a subfaction");
        System.out.println("1: Goffs");
        System.out.println("2: Bad Moons");
        System.out.println("3: Evil Sunz");

        int subResponse = scanner.nextInt();
        switch (subResponse) {
            case 1:
                // branch goffs
                subSelection = "Goffs";
                break;
            case 2:
                // branch bad moons
                subSelection = "Bad Moons";
                break;
            case 3:
                // branch evil sunz
                subSelection = "Evil Sunz";
                break;
            default:
                System.out.println("There was an error with your selection");
        }
    }


    //this will be used when editing an already created army.
    public void setArmyFaction(String armySelection) {
        this.armySelection = armySelection;
    }

    public String getArmyFaction() {
        return armySelection;
    }

    //this will be used when editing an already created army
    public void setSubFaction(String subSelection){
        this.subSelection = subSelection;
    }
    public String getSubSelection(){
        return subSelection;
    }

}