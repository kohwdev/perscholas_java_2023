package module303.array_processing_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeAssignmentArray {
    public static void main(String[] args) {
        /*
        Task 1: Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        */
        int[] arr = {1,2,3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        /*
        Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        */
        int[] arr1 = {13, 5, 7, 68, 2};

        int mid = arr1.length / 2;

        System.out.println(arr1[mid]);

        /*
        Task 3: Write a program that creates an array of String type and initializes it
        with the strings “red,” “green,” “blue,” and “yellow.” Print out the array length.
        Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify
        that the original array was copied.
        */
        String[] strArr = {"red", "green", "blue", "yellow"};
        System.out.println(strArr.length);

        String[] strArrCopy = strArr.clone();
        System.out.println(Arrays.toString(strArrCopy));

        /*
        Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
         The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
         Now try printing the value at index = length (e.g., myArray[myArray.length] ).
         Notice the type of exception which is produced. Now try to assign a value to the array index 5.
         You should get the same type of exception.
         */
        int[] numbers = {1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

//        System.out.println(numbers[numbers.length]);

        /*
        Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i) to
        the corresponding index in the array.
        */
        int[] intArr = {10,11,12,13,14};

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        System.out.println(Arrays.toString(intArr));

        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable multiplied by 2
        to the corresponding index in the array.
        */
        int[] intArr2 = {3,4,5,6,7};

        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = i * 2;
        }

        System.out.println(Arrays.toString(intArr2));

/*
Task 7: Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element, except for the middle (index 2) element.
*/
        int[] arr2 = {6,7,8,9,5};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == arr2[arr2.length / 2]) {
                continue;
            } else {
                System.out.print(arr2[i]);
            }
            System.out.println();
        }

    /*
    Task 8: Write a program that creates a String array of 5 elements
    and swaps the first element with the middle element without creating a new array.
    */
    String[] stringsArr = {"one","two","three","four","five"};

    int midIndex = stringsArr.length / 2;

    String temp = stringsArr[0];
    stringsArr[0] = stringsArr[midIndex];
    stringsArr[midIndex] = temp;

    for (int i = 0; i < stringsArr.length; i++) {
        System.out.println(stringsArr[i]);
    }
        System.out.println();


/*
Task 9:
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
Print the array in ascending order, and print the smallest and the largest element of the array.
The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13
*/
        int[] unSorted = {4, 2, 9, 13, 1, 0};

        Arrays.sort(unSorted);

        System.out.println("Array in ascending order: " + Arrays.toString(unSorted));
        System.out.println("The smallest number is " + unSorted[0]);
        System.out.println("The biggest number is " + unSorted[unSorted.length-1]);


/*
Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
*/
        Object[] mixed = {5,"one","two","three", 1.2};

        System.out.println(Arrays.toString(mixed));

        /*
Task 11: Write some Java code that asks the user how many favorite things they have.
Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created.
Finally, print out the contents of the array.

Example
How many favorite things do you have?
7

Enter your thing: phone
Enter your thing: tv
Enter your thing: xbox
Enter your thing: wine
Enter your thing: beer
Enter your thing: sofa
Enter your thing: book
Your favorite  things are:
phone tv xbox wine beer sofa book

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int favNum = scan.nextInt();
        scan.nextLine();
        String[] array = new String[favNum];


        for (int i = 0; i < favNum; i++) {
            System.out.print("Enter your thing: ");
            array[i] = scan.nextLine();
        }

        System.out.println("Your favorite things are: ");
        for (int i = 0; i < favNum; i++) {
            System.out.println(array[i]);
        }
        
    }
}
