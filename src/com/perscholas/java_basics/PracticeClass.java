package com.perscholas.java_basics;

public class PracticeClass {
    public static void main(String[] args) {
        //Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int num1;
        int num2;

        num1 = 2;
        num2 = 3;

        int sumInt = num1 + num2;

        System.out.println(sumInt);


        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double double1;
        double double2;

        double1 = 2.2;
        double2 = 5.5;

        double sumDouble = double1 + double2;
        System.out.println(sumDouble);


        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int number;
        double dub;

        number = 1;
        dub = 2.2;

        double sumIntDub = number + dub;
        System.out.println(sumIntDub);

        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result.
        int largeNum;
        int smallNum;

        largeNum = 100;
        smallNum = 2;

        int quotient = largeNum / smallNum;
        System.out.println(quotient);
        //Now change the larger number to a decimal. What happens? What corrections are needed?
        // When number is changed to a decimal Java throws an error and I need to change the variable type to double.

        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
        double largeDub;
        double smallDub;

        largeDub = 2222.5;
        smallDub = 4.9;

        double dubQuotient = largeDub / smallDub;

        System.out.println(dubQuotient);
        System.out.println((int)dubQuotient);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        int x;
        int y;

        x = 5;
        y = 6;

        int q = y / x;

        System.out.println(q);

        //Now, cast y to a double and assign it to q. Print q again.
        double x1;
        double y1;

        x1 = 5;
        y1 = 6;

        double q1 = y / x;

        System.out.println(q1);



        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        final int RESULT;

        int testNum = 2;
        int testNum2 = 6;

        RESULT = testNum + testNum2;
        System.out.println(RESULT);


        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
        // Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.

        double coffee;
        double cappuccino;
        double espresso;

        double subTotal;
        double totalSale;

        //assign price to each product
        coffee = 3.99;
        cappuccino = 2.99;
        espresso = 1.99;

        //3 items of first product
        double allFirst = coffee * 3;

        //4 items of second product
        double allSecond = cappuccino * 4;

        //2 items of third product
        double allThird = espresso * 2;

        subTotal = allFirst + allSecond + allThird;

        final double SALES_TAX = 10;

        totalSale = subTotal + SALES_TAX;

        System.out.println(totalSale);



    }
}
