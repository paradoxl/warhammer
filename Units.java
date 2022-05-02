import java.util.Scanner;

public class Units extends ArmyFaction {
    Scanner scanner = new Scanner(System.in);
    String[] unitsInArmy;
    private String unit;

    public void chooseUnits() {
        int totalPoints = 50;

        System.out.println("Please choose two units from the list below");
        System.out.println("you have a total of 50 points");
        int unitChoice = scanner.nextInt();
        System.out.println("1: 25 points - Heavy +10 damage");
        System.out.println("2: 20 points - Medium +5 damage");
        System.out.println("3:  5 points - light +1 damage");

        while (totalPoints > 0) {
            switch (unitChoice) {
                case 1:
                    System.out.println("You have chosen heavy!");
                    totalPoints = totalPoints - 25;
                    setUnit("Heavy");
                    break;

                case 2:
                    System.out.println("You have chosen Medium!");
                    totalPoints = totalPoints - 20;
                    setUnit("Medium");
                    break;

                case 3:
                    System.out.println("You have chosen light!");
                    totalPoints = totalPoints - 5;
                    setUnit("Light");
            }

            for(int i = 0; i < unitsInArmy.length ; i++){
                unitsInArmy[i] = getUnit();
            }
        }

    }

// give units specific quality for each faction
    public void applyPower(String power){
        // tie superpower to unit and add that modifer to the roll.
    }

    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getUnit(){
        return unit;
    }
}
