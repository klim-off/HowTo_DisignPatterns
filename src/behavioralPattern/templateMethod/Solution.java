package behavioralPattern.templateMethod;

import behavioralPattern.templateMethod.games.Catan;
import behavioralPattern.templateMethod.games.DiceForge;
import behavioralPattern.templateMethod.games.WelcomeTo;

/* 
Игра как жизнь
*/

public class Solution {

    public static void main(String[] args) {
        new Catan().start(4);
        new DiceForge().start(2);
        new WelcomeTo().start(10);
    }
}
