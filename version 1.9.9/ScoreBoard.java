import java.util.Scanner;
import java.util.Formatter;
import java.io.FileOutputStream;

public class ScoreBoard {
    Scanner scanner = new Scanner(System.in);

    private int wins;
    private int loses;

    public void save() {
        try {

            Formatter outfile = new Formatter(new FileOutputStream("scores.sql", true));
            outfile.format("Wins: " + getWins()+ "losses" + getLoses()  + ";\n");
            outfile.close();

            // Formatter output = new Formatter("wins/loses.txt");
            // output.format("%s %s", "games won / lost : ", getWins(), getLoses());
            // output.close();
        } catch (Exception FormatterClosedException) {
            System.out.println("WARNING");
            System.out.println("Could not find/open file");
            System.out.println("WARNING");
        }

    }

    public int getWins() {
        return wins;
    }
    public void setWins(int wins){
        this.wins = wins;
    }

    public int getLoses(){
        return loses; 
    }
    public void setLoses(int loses){
        this.loses = loses;
    }
}
