package structuralPattern.bridge;

public class SwimmingMeowingHuman implements Creature {
    @Override
    public void move() {
        System.out.println("Человек гребет ластами.");
    }

    @Override
    public void sound() {
        System.out.println("Человек мяукает.");
    }

    public void searchMeaningOfLife() {
        System.out.println("Человек ищет смысл жизни.");
    }
}
