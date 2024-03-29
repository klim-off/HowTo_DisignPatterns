package behavioralPattern.visitor.animals;

import behavioralPattern.visitor.visitors.Visitor;

public class Dog extends Animal {

    private int bones;

    @Override
    public String getName() {
        return "Пес";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDog(this);
    }

    public int bonesGnawed() {
        return bones;
    }

    public void eat() {
        bones++;
        System.out.println(getName() + " обглодал кость.");
    }
}
