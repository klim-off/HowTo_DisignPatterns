package creatinalPattern.builder.builders;

import creatinalPattern.builder.pizzas.Pizza;
import creatinalPattern.builder.pizzas.PizzaType;

public class PizzaBuilder implements Builder{
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;


    public Pizza getResult(){

        return new Pizza(this.type,this.dough,this.sauce,this.topping);
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
