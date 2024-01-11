package module303.pizza_exercise;

import java.util.ArrayList;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza smallPizza = new Pizza("small", 1, 2, 3);
        Pizza mediumPizza = new Pizza("medium", 2,3,2);
        Pizza largePizza = new Pizza("large",1,1,2);

        System.out.println(smallPizza.calcCost());
        System.out.println(smallPizza.getDescription());

        System.out.println(mediumPizza.calcCost());
        System.out.println(mediumPizza.getDescription());

        System.out.println(largePizza.calcCost());
        System.out.println(largePizza.getDescription());

        ArrayList<Pizza> pizzas = new ArrayList<>();

        pizzas.add(smallPizza);
        pizzas.add(mediumPizza);
        pizzas.add(largePizza);


        PizzaOrder order = new PizzaOrder(pizzas);

        System.out.println(order.calcTotal());



    }
}
