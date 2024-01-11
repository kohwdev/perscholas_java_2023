package module303.pizza_exercise;

import java.util.ArrayList;

public class PizzaOrder extends Pizza {
    private ArrayList<Pizza> pizzas;
    private double totalOrderCost = 0;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double calcTotal() {
        for (Pizza pizza : pizzas) {
            totalOrderCost += pizza.calcCost();
        }
        return totalOrderCost;
    }



}
