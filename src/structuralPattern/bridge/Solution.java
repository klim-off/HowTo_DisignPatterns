package structuralPattern.bridge;

/* 
Фантастические твари
*/

import structuralPattern.bridge.creature.Cow;
import structuralPattern.bridge.creature.Human;
import structuralPattern.bridge.move.Fly;
import structuralPattern.bridge.move.MoveLogic;
import structuralPattern.bridge.move.Swim;
import structuralPattern.bridge.sound.Meow;
import structuralPattern.bridge.sound.SoundLogic;
import structuralPattern.bridge.sound.Speak;

public class Solution {

    public static void main(String[] args) {

        Cow cow = new Cow(new Fly(), new Meow());
        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();

        Human human = new Human(new Swim(), new Speak());
        human.howDoIMove();
        human.howDoISound();
        human.searchMeaningOfLife();

       /* FlyingSpeakingСow cow = new FlyingSpeakingСow();
        cow.move();
        cow.sound();
        cow.giveMilk();

        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
        human.move();
        human.sound();
        human.searchMeaningOfLife();*/
    }
}
