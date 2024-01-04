package module303;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class FormattingOutput {

    public static void main(String[] args) {
        System.out.println("Per Scholas"); //prints on a new line

        System.out.print("Apple"); //next statement prints on the same line
        System.out.print("Total: ");

        double applePrice = 7.0;
        double quantity = 3.0;

        System.out.println(applePrice / quantity);

        System.out.printf("Total %.2f", applePrice / quantity);

        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\r\n");

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
        System.out.format("%tD%n", c);    // -->  "05/29/06"


        LocalDate dob = LocalDate.of(1971, Month.MAY, 16);
        System.out.printf("%1$tB %1$td, %1$tY is %2$s's birth day. Let's go and celebrate.", dob, "Mike");

    }



}
