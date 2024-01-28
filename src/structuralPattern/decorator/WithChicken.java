package structuralPattern.decorator;

public class WithChicken extends PizzaDecorator {

    protected WithChicken(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return (super.getCost() + 20);
    }

    @Override
    public String getIngredients() {
        return (super.getIngredients() + ", курица");
    }
}
