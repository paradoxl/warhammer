import java.util.Scanner;

public class ArmyFaction{
    Scanner scanner = new Scanner(System.in);
    private String Army;
    private String sub;

    public void chooseArmy(){
        System.out.println("Please select an army below");
        System.out.println("1: Space marines");
        System.out.println("2: chaos space marines");
        System.out.println("3: orks");
        
        int selection = scanner.nextInt();

        switch (selection){
            case 1:
                SMSubSelection();
                break;
            case 2:
                ChaosSubSelection();
                break;
            case 3: 
                OrkSelection();
                break;
            default:
                System.out.println("there was an error in your selection");
        }
            scanner.close();
    }

    public void SMSubSelection(){
        System.out.println("Please choose a subfaction");
        System.out.println("1: UltraMarines");
        System.out.println("2: Dark Angels");
        System.out.println("3: Space wolves");

       
        int subResponse = scanner.nextInt();
        switch (subResponse){
            case 1:
                // branch ultramarine
                break;
            case 2:
                // branch Dark Angels
                break;
            case 3: 
                //branch Space wolves
                break;
            default:
                System.out.println("there was an error in your selection");
    
            }
            
    }
    public void ChaosSubSelection(){
        System.out.println("Please choose a subfaction");
        System.out.println("1: Death Guard");
        System.out.println("2: Thousand sons");
        System.out.println("3: Night Lords");
        
        int subResponse = scanner.nextInt();
        switch(subResponse){
            case 1:
                //branch death guard
                break;
            case 2:
                // branch thousand sons
                break;
            case 3:
                // branch night lords
                break;
            default:
                System.out.println("there was an error with your selection");
        }

    }

    public void OrkSelection(){
        System.out.println("please choose a subfaction");
        System.out.println("1: Goffs");
        System.out.println("2: Bad Moons");
        System.out.println("3: Evil Sunz");

        int subResponse = scanner.nextInt();
        switch(subResponse){
            case 1:
                //branch goffs
                break;
            case 2:
                //branch bad moons
                break;
            case 3:
                // branch evil sunz
                break;
            default:
                System.out.println("There was an error with your selection");
        }
    }
    
}