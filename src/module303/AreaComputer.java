package module303;
//This class allows the calculation of the area of a circle using radius.
public class AreaComputer {
    //This is the entry point into the JVM:
    public static void main(String[] args) {
        //Declare variables:
        double radius; //one of the 'integral' types for when we need a decimal value
        double area;

        //Assign a value;
        radius = 20;
        final double PI = 3.14159;
        final double PI2 = Math.PI;

        //Compute area:
        area = radius * radius * PI;
        //area = radius * radius * Math.PI;

        //Display results:
        //String concatenation:
        System.out.println("The area for the circle of " + "radius " + radius + " is " + area);

        //char(''), String("")

    }
}
