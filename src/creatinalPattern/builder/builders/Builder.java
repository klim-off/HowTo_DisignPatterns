package creatinalPattern.builder.builders;

import creatinalPattern.builder.pizzas.PizzaType;

public interface Builder {
    public void setType(PizzaType type);

    public void setDough(String dough);

    public void setSauce(String sauce);

    public void setTopping(String topping);
}
