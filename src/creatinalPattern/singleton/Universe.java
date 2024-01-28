package creatinalPattern.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class Universe {
    private static Universe instance;
    private final Set<String> laws = new HashSet<>();

    public static Universe getInstance(){
        if (Universe.instance == null) {
            Universe.instance = new Universe();
        }
        return Universe.instance;
    }
    private Universe() {
        System.out.println("Начинается тонкая настройка непреложных законов вселенной...");
        tune("скорость света");
        tune("гравитационная постоянная");
        tune("постоянная Планка");
        tune("масса электрона");
        tune("масса протона");
        tune("заряд электрона");
        System.out.println("Тонкая настройка непреложных законов вселенной окончена.");
    }

    public Set<String> getLaws() {
        return Collections.unmodifiableSet(laws);
    }

    private void tune(String low) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("устанавливается " + low);
        laws.add(low);
    }
}
