import java.util.Formatter;
import java.util.Scanner;

public class ArmyFaction {
    Scanner scanner = new Scanner(System.in);
    private String armySelection;
    private String subSelection;
    private String specialPower;
    private String waaaagggh;
    private String emperorsLight;
    private String bloodForTheBloodGod;

    Units infantry = new Units();

    public void writeArmy(){
    try
    {
        Formatter output = new Formatter("ArmyData.txt");
        output.format("%s %s", getArmyFaction(), getSubSelection());
        output.close();
    }catch(Exception e)
    {
        System.out.println("WARNING");
        System.out.println("Could not find/open file");
        System.out.println("WARNING");
    }
}

    public void chooseArmy() {
        System.out.println("Please select an army below");
        System.out.println("1: Space marines");
        System.out.println("2: chaos space marines");
        System.out.println("3: orks");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                SMSubSelection();
                setArmyFaction("Space marines");
                specialPower = emperorsLight;
                infantry.chooseUnits();
                break;
            case 2:
                ChaosSubSelection();
                setArmyFaction("Chaos Space Marines");
                specialPower = bloodForTheBloodGod;
                infantry.chooseUnits();
                break;
            case 3:
                OrkSelection();
                setArmyFaction("Ork");
                specialPower = waaaagggh;
                infantry.chooseUnits();
                break;
            default:
                System.out.println("there was an error in your selection");
        }
       
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
                setSubFaction("UltraMarines");

                break;
            case 2:
                // branch Dark Angels
                setSubFaction("Dark Angles");
                break;
            case 3:
                // branch Space wolves
                setSubFaction("Space Wolves");
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
                setSubFaction("Death Guard");
                break;
            case 2:
                // branch thousand sons
                setSubFaction("Thousand sons");
                break;
            case 3:
                // branch night lords
                setSubFaction("Night Lords");
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
                setSubFaction("Goffs");
                break;
            case 2:
                // branch bad moons
                setSubFaction("Bad moons");
                break;
            case 3:
                // branch evil sunz
                setSubFaction("Evil Sunz");
                break;
            default:
                System.out.println("There was an error with your selection");
        }
    }


    

    // this will be used when editing an already created army.
    public void setArmyFaction(String armySelection) {
        this.armySelection = armySelection;
    }

    public String getArmyFaction() {
        return armySelection;
    }

    // this will be used when editing an already created army
    public void setSubFaction(String subSelection){
        this.subSelection = subSelection;
    }

    public String getSubSelection(){
        return subSelection;
    }

}