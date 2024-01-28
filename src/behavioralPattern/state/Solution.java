package behavioralPattern.state;

import behavioralPattern.state.ui.Player;
import behavioralPattern.state.ui.UI;

/* 
Usb mp3 плеер
*/

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
