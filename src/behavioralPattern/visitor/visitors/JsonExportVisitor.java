package behavioralPattern.visitor.visitors;

import behavioralPattern.visitor.animals.Cat;
import behavioralPattern.visitor.animals.Cow;
import behavioralPattern.visitor.animals.Dog;

public class JsonExportVisitor implements Visitor {

    @Override
    public String visitCat(Cat cat) {
        return "{\n" +
                "  \"name\" : \"" + cat.getName() + "\",\n" +
                "  \"mice\" : \"" + cat.miceCaught() + "\",\n" +
                "  \"kilogramsOfFur\" : \"" + cat.furEaten() + "\"\n" +
                "}";
    }

    @Override
    public String visitCow(Cow cow) {
        return "{\n" +
                "  \"name\" : \"" + cow.getName() + "\",\n" +
                "  \"litersOfMilk\" : \"" + cow.milkedLiters() + "\",\n" +
                "  \"stars\" : \"" + cow.getStars() + "\"\n" +
                "}";
    }

    @Override
    public String visitDog(Dog dog) {
        return "{\n" +
                "  \"name\" : \"" + dog.getName() + "\",\n" +
                "  \"bones\" : \"" + dog.bonesGnawed() + "\"\n" +
                "}";
    }
}
