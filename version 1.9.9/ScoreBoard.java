import java.util.Scanner;
import java.util.Formatter;

public class ScoreBoard {
    Scanner scanner = new Scanner(System.in);
    Warhammer fac = new Warhammer();
    private int wins;
    private int loses;

    public void save() {
        try {
            Formatter output = new Formatter("played as.txt");
            output.format("%s %s", "games won / lost : ", getWins(), getLoses());
            output.close();
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
