
public class Player extends Warhammer {
    protected boolean playerState = true;
    protected int healthPoints = 25;
    protected int damageMod = 10;
    Warhammer fac = new Warhammer();

 

    public void applySkills() {
        if (fac.getArmyFaction() == "Space Marines") {
            healthPoints = healthPoints + 50;
        }
        if (fac.getArmyFaction() == "Chaos Marines"){
            damageMod = damageMod + 5;
        }
    }





    public void setDamageMod(int damageMod){
        this.damageMod = damageMod;
    }
    public int getDamageMod(){
        return damageMod;
    }

    public void setPlayerState(Boolean playerState) {
        this.playerState = playerState;
    }

    public boolean getPlayerState() {
        return playerState;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

}
