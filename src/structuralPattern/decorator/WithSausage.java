package structuralPattern.decorator;

public class WithSausage extends PizzaDecorator {

    protected WithSausage(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public double getCost() {
        return (super.getCost() + 25);
    }

    @Override
    public String getIngredients() {
        return (super.getIngredients() + ", колбаса");
    }
}
