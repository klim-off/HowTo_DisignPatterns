package structuralPattern.bridge.creature;

import structuralPattern.bridge.move.MoveLogic;
import structuralPattern.bridge.sound.SoundLogic;

public class Cat extends Creature{
    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Кошка";
    }
    public void catchMice(){
        System.out.println(this.getName() + " ловит мышей.");
    }

}
