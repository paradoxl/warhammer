import java.util.Scanner;

public class Warhammer {
    private String armyFaction;
    private String subFaction;
    private String specialPower;
    private String light;
    private String dark;


    Scanner scanner = new Scanner(System.in);

    public void createArmy() {
        System.out.println("Please choose a faction:");
        System.out.println("1: Space marines");
        System.out.println("2: Chaos Marines");
        int choice = scanner.nextInt();

        if (choice == 1) {
            setArmyFaction("Space Marines");
            setPower("Emperors light");
        }
        if (choice == 2) {
            setArmyFaction("Chaos Marines");
            setPower("Chaos");
        }

    }

    public void setArmyFaction(String armyFaction) {
        this.armyFaction = armyFaction;
    }

    public String getArmyFaction() {
        return armyFaction;
    }

    public void setPower(String specialPower){
        this.specialPower = specialPower;
    }

    public String getPower(){
        return specialPower;
    }
}
