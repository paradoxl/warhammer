import java.util.Scanner;

public class Gameplay {
    private int playerRoll;
    private int enemyRoll;
    private boolean playerTurn = false;
    private boolean enemyTurn = false;
    private int wins;
    private int loses;

    Scanner scanner = new Scanner(System.in);

    Player player1 = new Player();
    Enemy enemy1 = new Enemy();
    Dice dice = new Dice();
    
    ScoreBoard write = new ScoreBoard();

    public void playGame() {

        System.out.println("The battle has started!");
        System.out.println("To determine who strikes first we will each roll a d20");

        dice.roll20();
        playerRoll = dice.getHitDie();

        System.out.println("You have rolled a :" + dice.getHitDie());

        dice.roll20();
        enemyRoll = dice.getHitDie();

        if (playerRoll > enemyRoll) {
            System.out.println("you have taken the initiative! attack now!");

            playerTurn();
            playerTurn = true;
            enemyTurn = false;

        } else if (enemyRoll > playerRoll) {
            System.out.println("The enemy has battered your defenses!");

            computerTurn();
            playerTurn = false;
            enemyTurn = true;

        } else {
            System.out.println("Orbital Bombardment!!!!");
            player1.playerState = false;
            enemy1.playerState = false;
            System.out.println("Both armies were destroyed in the bombardment");
        }

      
        
        while(player1.playerState && enemy1.playerState == true){
            if(player1.healthPoints <= 0){
                player1.playerState = false;
            }
            if(enemy1.healthPoints <= 0){
                enemy1.playerState = false;
            }
            

            if (playerTurn == true){
                playerTurn();
                try{
                System.out.println("Would you like to use your power now? 1: y 2: n");
                int battleChoice = scanner.nextInt();
                if(battleChoice == 1){
                    player1.healthPoints = player1.healthPoints + 3;
                 System.out.println("Our Medical units are inbound! we've gained 3 HP");
                 System.out.println("Our forces are now at " + player1.healthPoints);
                }
                else{
                playerTurn = false;
                enemyTurn = true;
                }
            }catch(Exception InputMismatchException){
                System.out.println("our vox is down! theres an issue!");
            }
              
            }


            if (enemyTurn == true){
                computerTurn();
                dice.roll20();
                if(dice.getHitDie() > 15){
                    enemy1.healthPoints = enemy1.healthPoints + 3;
                }
                playerTurn = true;
                enemyTurn = false;

        }

        if (player1.healthPoints <= 0){
            System.out.println("You have been beaten! Retreat!");
           
            System.out.println("Army health : " + player1.healthPoints +" To " + enemy1.healthPoints);
            loses = loses + 1;
            wins = wins + 0;
            write.setLoses(loses);
            write.setWins(wins);
            write.save();
        }
        else if (enemy1.healthPoints <= 0){
            System.out.println("You've beaten back the enemy!");
            
            System.out.println("Army health : " + player1.healthPoints +" To " + enemy1.healthPoints);
            wins = wins + 1;
            loses = loses + 0;
            write.setWins(wins);
            write.setLoses(loses);
            write.save();
        }

    

    }
}

    public void playerTurn() {

        if (player1.playerState && enemy1.playerState == true) {
            dice.roll6();
            enemy1.healthPoints = enemy1.healthPoints - dice.getDamageDice();
            System.out.println(
                    "you have done " + dice.getDamageDice() + " damage " + "leaveing them at at " + enemy1.healthPoints);
            
        }

    }

    public void computerTurn() {

        if (player1.playerState && enemy1.playerState == true) {
            dice.roll6();
            player1.healthPoints = player1.healthPoints - dice.getDamageDice();
            System.out.println(
                    "They have done " + dice.getDamageDice() + " damage " + "leaveing you at " + player1.healthPoints);
           
        }
    }

    // public void ClearConsoleScreen() {
        
    //         System.out.print("Everything on the console will cleared");
    //         System.out.print("\033[H\033[2J");
    //         System.out.flush();
        
    // }
    
    


}

// take turns until health reaches zero.
