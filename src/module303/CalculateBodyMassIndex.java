package module303;

import java.util.Scanner;

public class CalculateBodyMassIndex {
    //BMI is a measure of health on weight.
    //BMI = (Weight in Kg) / (Height in Meters * Height in Meters)
    // weight = 75kg, height = 1.5m
    // BMI = 75 / (1.5 * 1.5) = 33.33
    /*
    The interpretation of BMI for people 16 years or older
    BMI < 18.5 Underweight
    18.5 <= BMI < 25.0 Normal
    25.0 <= BMI < 30.0 Overweight
    30.0 <= BMI Obese
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the weight(kg): ");
        int weight = scan.nextInt();
        System.out.print("Enter the height(m): ");
        double height = scan.nextDouble();

        double bmi = weight / (height * height);

        String formattedBmi = String.format("%.02f", bmi);

        if (bmi < 18.5) {
            System.out.println(formattedBmi + " Underweight");
        }
        else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println(formattedBmi + " Normal");
        }
        else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println(formattedBmi + " Overweight");
        }
        else {
            System.out.println(formattedBmi + " Obese");
        }

    }
}
