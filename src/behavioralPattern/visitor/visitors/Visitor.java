package behavioralPattern.visitor.visitors;

import behavioralPattern.visitor.animals.Cat;
import behavioralPattern.visitor.animals.Cow;
import behavioralPattern.visitor.animals.Dog;

public interface Visitor {

    public  String visitCat(Cat cat);
    public  String visitCow(Cow cow);

    public  String visitDog(Dog dog);


}
