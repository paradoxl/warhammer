public class Driver {
    public static void main(String[] args) {
        Warhammer create = new Warhammer();
        Player player1 = new Player();
        Enemy enemy1 = new Enemy();
        Gameplay start = new Gameplay();

        create.createArmy();
        System.out.println(create.getArmyFaction());
            start.playGame();

        
    }
}