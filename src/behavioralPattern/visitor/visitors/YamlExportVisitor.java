package behavioralPattern.visitor.visitors;

import behavioralPattern.visitor.animals.Cat;
import behavioralPattern.visitor.animals.Cow;
import behavioralPattern.visitor.animals.Dog;

public class YamlExportVisitor implements Visitor{
    @Override
    public String visitCat(Cat cat) {
        return "--- !<Cat>\n" +
                "name: \"" + cat.getName() + "\"\n" +
                "mice: " + cat.miceCaught() + "\n" +
                "kilogramsOfFur: " + cat.furEaten();
    }

    @Override
    public String visitCow(Cow cow) {
        return "--- !<Cow>\n" +
                "name: \"" + cow.getName() + "\"\n" +
                "litersOfMilk: " + cow.milkedLiters() + "\n" +
                "stars: " + cow.getStars();
    }

    @Override
    public String visitDog(Dog dog) {
        return "--- !<Dog>\n" +
                "name: \"" + dog.getName() + "\"\n" +
                "bones: " + dog.bonesGnawed();
    }
}
