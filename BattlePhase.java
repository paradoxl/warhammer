public class BattlePhase extends Dice {
    Dice dice = new Dice();

    public void battle() {

        // loop this until health is gone.
        // bug health becomes negative
        while (healthCounter > 0) {
            dice.rollForHit();
            System.out.println("You have rolled: " + dice.getHitDie());
            if (dice.getHitDie() > 10) {
                dice.dSix();
            }

            // traditionally in D&D and warhammer you roll for attack. This will show
            // whether you were
            // able to even hit the unit. from there we move on to damage. i.e. roll for hit
            // and then damage with d6

        }

    }

}
