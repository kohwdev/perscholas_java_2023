package module303;

import java.util.Scanner;

/* How to use Scanner to get input from the console and the different forms of input */
public class UsingScanner {
    public static void main(String[] args) {
        //Declare a variable of type Scanner (object of type Scanner) or (instance of type Scanner)
        Scanner input = new Scanner(System.in); //constructor(argument - input from the keyboard) call every time when object is created

        String wholeLine, beforeWhiteSpace;
        int integerFromUser;
        byte byteFromUser;
        short shortFromUser;
        long longFromUser;
        double doubleFromUser;
        float floatFromUser;

        System.out.print("Please enter a sentence: ");
        wholeLine = input.nextLine();

        System.out.println("This is the sentence you entered: " + wholeLine);

        //close the scanner after you are done with it
        input.close();
    }
}
