package structuralPattern.decorator;

public class SimplePizza implements Pizza {
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "тесто, помидоры, сыр";
    }
}
