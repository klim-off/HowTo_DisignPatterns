package behavioralPattern.visitor.animals;

import behavioralPattern.visitor.visitors.Visitor;

public abstract class Animal {

    public abstract String getName();

    public abstract  String accept(Visitor visitor);
}
