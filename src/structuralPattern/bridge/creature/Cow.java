package structuralPattern.bridge.creature;

import structuralPattern.bridge.move.MoveLogic;
import structuralPattern.bridge.sound.SoundLogic;

public class Cow extends Creature{
    public Cow(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Корова";
    }
    public void giveMilk(){
        System.out.println(this.getName() + " дает молоко.");
    }
}
