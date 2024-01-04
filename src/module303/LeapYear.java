package module303;

import java.util.Scanner;

public class LeapYear {
    //Prompts the user to enter a year as an int, and checks if it is a leap year.
    //A year is leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year");
        }
        else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }


}
