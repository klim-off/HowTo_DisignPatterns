package structuralPattern.decorator;

/* 
Фирменный рецепт
The decorator design pattern is used to modify the functionality of an object at runtime.
 At the same time, other instances of the same class will not be affected by this,
 so the individual object gets the modified behavior. The decorator design pattern
  is one of the structural design patterns (such as adapter pattern, bridge pattern,
   or composite pattern) and uses abstract classes or interface with the composition to implement.
*/

public class Solution {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        printInfo(pizza);

        pizza = new WithChicken(pizza);
        printInfo(pizza);

        pizza = new WithSausage(pizza);
        printInfo(pizza);

        pizza = new WithArugula(pizza);
        printInfo(pizza);
    }

    public static void printInfo(Pizza c) {
        System.out.println("Итого: " + c.getCost() + "; Состав: " + c.getIngredients());
    }
}
