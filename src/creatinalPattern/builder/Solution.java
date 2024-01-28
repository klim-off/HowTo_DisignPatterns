package creatinalPattern.builder;


/* 
Все ходы записаны
*/

import creatinalPattern.builder.director.Director;
import creatinalPattern.builder.builders.PizzaBuilder;
import creatinalPattern.builder.builders.PizzaRecipeBuilder;
import creatinalPattern.builder.pizzas.Pizza;
import creatinalPattern.builder.pizzas.Recipe;

public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
