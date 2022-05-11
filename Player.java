
public class Player  {
    protected boolean playerState = true;
    protected int healthPoints = 25;
   

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
