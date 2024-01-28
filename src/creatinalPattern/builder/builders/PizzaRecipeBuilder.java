package creatinalPattern.builder.builders;

import creatinalPattern.builder.pizzas.PizzaType;
import creatinalPattern.builder.pizzas.Recipe;

public class PizzaRecipeBuilder implements Builder{
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

    public Recipe getResult(){

        return new Recipe(this.type,this.dough,this.sauce,this.topping);
    }

    @Override
    public void setType(PizzaType type) {
        this.type = type;

    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;

    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;

    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;

    }
}
