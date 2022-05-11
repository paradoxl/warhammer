import java.security.SecureRandom;

public class Dice extends Warhammer{
    private int hitDie;
    private int damageDice;
    final SecureRandom random = new SecureRandom();

    public void damageMod(){
        damageDice = damageDice + 1;
    }

    public void roll20() {
        hitDie = 1 + random.nextInt(20);
    }

    public void roll6(){
        damageDice = 1 + random.nextInt(6);
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }
    public int getHitDie() {
        return hitDie;
    }
    public void setDamageDice(int damageDice) {
        this.damageDice = damageDice;
    }
    public int getDamageDice() {
        return damageDice;
    }
}
