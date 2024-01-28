package behavioralPattern.templateMethod.games;

import java.util.Random;

public abstract  class BoardGame {
    private int playersAmount;

    public final void start(int n){
        setPlayersAmount(n);
        initialize();
        play();
        end();
        printWinner();
    }

    protected abstract void initialize();
    protected abstract void play();
    protected abstract void end();
    protected void  printWinner(){
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }
    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }
}
