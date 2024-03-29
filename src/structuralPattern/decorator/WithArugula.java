package structuralPattern.decorator;

public class WithArugula extends PizzaDecorator {

    protected WithArugula(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return (super.getCost() + 15);
    }

    @Override
    public String getIngredients() {
        return (super.getIngredients() + ", руккола");
    }
}
