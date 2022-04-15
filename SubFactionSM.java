import java.util.Scanner;

public class SubFactionSM {
    public void SubSelection(){
        System.out.println("Please choose a subfaction");
        System.out.println("1: UltraMarines");
        System.out.println("2: Dark Angels");
        System.out.println("3: Space wolves");

        Scanner scanner = new Scanner(System.in);
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
            scanner.close();
    }

}
