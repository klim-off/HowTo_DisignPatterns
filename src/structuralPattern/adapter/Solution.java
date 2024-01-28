package structuralPattern.adapter;

import java.util.HashSet;
import java.util.Set;

/* 
The adapter design pattern is one of the structural design patterns and
 is used so that two unrelated interfaces can work together.
 The object that joins these unrelated interfaces is called an adapter.
*/

public class Solution {

    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        HardWorker worker2 = new HardWorker("Bob Jr.", getNailsPack(), new MicroscopeAdapter(new Microscope()));

        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }

    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}
