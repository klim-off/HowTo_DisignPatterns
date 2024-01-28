package creatinalPattern.builder.director;

import creatinalPattern.builder.builders.Builder;

import static creatinalPattern.builder.pizzas.PizzaType.HAWAIIAN;
import static creatinalPattern.builder.pizzas.PizzaType.SPICY;

public class Director {
    public void makeHawaiianPizza(Builder builder) {
        builder.setType(HAWAIIAN);
       builder.setDough("обычное");
       builder.setSauce("мягкий");
       builder.setTopping("ветчина + ананас");

    }

    public void makeSpicyPizza(Builder builder) {

        builder.setType(SPICY);
        builder.setDough("запеченное");
        builder.setSauce("острый");
        builder.setTopping("пепперони + салями");

    }
}
