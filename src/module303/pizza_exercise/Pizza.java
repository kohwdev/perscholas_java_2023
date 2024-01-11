package module303.pizza_exercise;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public Pizza(){
        this("",0,0,0);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    private static final double COST_OF_TOPPINGS = 2.0;
    private static final double COST_OF_SMALL = 10;
    private static final double COST_OF_MEDIUM = 12;
    private static final double COST_OF_LARGE = 14;





    public double calcCost() {
        double pizzaCost = 0;

        switch (size.toLowerCase()){
            case "small":
                pizzaCost = COST_OF_SMALL + ((cheeseToppings + pepperoniToppings + hamToppings) * COST_OF_TOPPINGS);
                break;
            case "medium":
                pizzaCost = COST_OF_MEDIUM + ((cheeseToppings + pepperoniToppings + hamToppings) * COST_OF_TOPPINGS);
                break;
            case "large":
                pizzaCost = COST_OF_LARGE + ((cheeseToppings + pepperoniToppings + hamToppings) * COST_OF_TOPPINGS);
                break;
        }
        return pizzaCost;
    }

    public String getDescription() {
        return "The size of pizza is " + size + " and it has " + cheeseToppings +" cheese "+ pepperoniToppings + " pepperoni " + hamToppings + " ham";
    }

}
