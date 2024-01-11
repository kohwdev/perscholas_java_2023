package module303.loops;

import java.util.Scanner;

public class PracticeAssignmentLoops {
    public static void main(String[] args) {
        //1. Print a Multiplication Table - write a program that uses nested for loops to print a multiplication table.

        int x = 12;

        for (int i = 1; i <= x; i++){
            for(int j = 1; j <= 12; j++) {
                int product = i * j;

                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println();
        }

        //2. Find the greatest common divisor - write a program that prompts the user to enter two positive integers,
        // and find their greatest common divisor(GCD).
        // Enter 2 and 4, GCD is 2
        // Enter 16 snd 24, GCD is 8

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Greatest Common Divisor is " + gcd);


        //3. Predict Future Tuition
        //Suppose the tuition for a university is $10000 for the current year and increases by 7 percent every year
        //in how many years will the tuition be doubled?

        double initialTuition = 10000;
        double targetTuition = initialTuition * 2;

        int years = 0;

        while (initialTuition < targetTuition) {
            initialTuition *= 1.07;

            years++;
        }

        System.out.println("It will take " + years + " years.");



    }
}
