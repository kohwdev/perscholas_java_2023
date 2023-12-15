package module303;

import java.net.Inet4Address;

public class OperatorsAndNumbersPA {
    public static void main(String[] args) {
        /*Write a program that declares an integer a variable x, assigns the value 2 to it,
        and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results,
        write a comment with the predicted decimal value and binary string.
        Now, print out x in decimal form and in binary notation.
        Perform the preceding exercise with the following values: 9 17 88
        */
//        int x = 2;
//        System.out.println(Integer.toBinaryString(x));
//
//        x = x << 1; //decimal value 4, binary string 100
//
//        System.out.println(x);
//        System.out.println(Integer.toBinaryString(x));

//        int x = 9;
//        System.out.println(Integer.toBinaryString(x));
//
//        x = x << 1; //decimal value 18, binary string 10010
//        System.out.println(x);
//        System.out.println(Integer.toBinaryString(x));

//        int x = 17;
//        System.out.println(Integer.toBinaryString(x));
//
//        x = x << 1; //decimal value 34, binary string 100010
//
//        System.out.println(x);
//        System.out.println(Integer.toBinaryString(x));


//        int x = 88;
//        System.out.println(Integer.toBinaryString(x));
//
//        x = x << 1; //decimal value 176, binary string 10110000
//
//        System.out.println(x);
//        System.out.println(Integer.toBinaryString(x));



        /*
        Write a program that declares a variable x, and assigns 150 to it,
        and prints out the binary string version of the number.
        Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        Write a comment indicating what you anticipate the decimal and binary values to be.
        Now print the value of x and the binary string.
        Perform the preceding exercise with the following values: 225 1555 32456
        */
//        int x1 = 150;
//        System.out.println(Integer.toBinaryString(x1));
//
//        x1 = x1 >> 2; //decimal 37, binary 100101
//
//        System.out.println(x1);
//        System.out.println(Integer.toBinaryString(x1));

        /*

        */
//        int x1 = 225;
//        System.out.println(Integer.toBinaryString(x1));
//
//        x1 = x1 >> 2; //decimal 56, binary 111000
//
//        System.out.println(x1);
//        System.out.println(Integer.toBinaryString(x1));


//        int x1 = 1555;
//        System.out.println(Integer.toBinaryString(x1));
//
//        x1 = x1 >> 2; //decimal 388, binary 1110000100
//
//        System.out.println(x1);
//        System.out.println(Integer.toBinaryString(x1));


//        int x1 = 32456;
//        System.out.println(Integer.toBinaryString(x1));
//
//        x1 = x1 >> 2; //decimal 8114, binary 1111110110010
//
//        System.out.println(x1);
//        System.out.println(Integer.toBinaryString(x1));

        /*



Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.

*/
//        int x = 7, y = 17, z;
//
//        // Binary representation of 7: 0111
//        // Binary representation of 17: 0001 0001
//        // 0001 = 1
//
//        z = x & y;
//
//        System.out.println("Decimal: " + z);
//        System.out.println("Binary: " + Integer.toBinaryString(z));

        /*


Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
As before, write a comment that indicates what you predict the values to be before printing them out.

*/
//        int x = 7, y = 17, z;
//
//        //decimal:23
//        //binary: 10111
//
//        z = x | y;
//
//        System.out.println("Decimal: " + z);
//        System.out.println("Binary: " + Integer.toBinaryString(z));

/*
Write a program that declares an integer variable, assigns a number,
and uses a postfix increment operator to increase the value. Print the value before and after the increment operator.
    */
        int number = 4;
        System.out.println("before increment: " + number);
        number++;
        System.out.println("after increment: " + number);

        /*



Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.

    */
        int value = 3;

        System.out.println("initial value: " + value);

        value++;

        System.out.println("after increment using ++: " + value);

        value+=1;

        System.out.println("after increment using +=: " + value);

        value = value + 1;

        System.out.println("after increment using +: " + value);



        /*



Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
Create another variable sum and assign the value of ++x added to y, and print the result.
Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum,
while the second configuration calculated the sum, and then incremented x.

*/
        int x = 5;
        int y = 8;

        //int sum = y + (++x);

        //System.out.println(sum);
        //change increment operator to postfix
        int sum = y + (x++);

        System.out.println(sum); //prints 13





        /*




*/
    }
}
