package structuralPattern.bridge.creature;

import structuralPattern.bridge.move.MoveLogic;
import structuralPattern.bridge.sound.SoundLogic;

public class Human extends Creature{
    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Человек";
    }
    public void searchMeaningOfLife(){
        System.out.println(this.getName() + " ищет смысл жизни.");
    }

}
