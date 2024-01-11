package module303.array_processing_manipulation;

import java.util.Scanner;

public class InitializingArrays {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // -- reading the number of elements from the that we want to enter
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            //-- reading array elements from the user
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // -- accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }


        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        // iterating through each element of the array
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);


//finding minimum/smallest element in an array
        int[] myarray = {0, 2, 4, 6, 8, 10};
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < minVal) {
                minVal = myarray[i];
            }
        }
        System.out.println("minVal = " + minVal);

//finding maximum/biggest element in an array
        int[] arr = {25,0,2,4,6,8,10};
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println("Max Element = " + maxVal);


//reversing order of an array
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};
        //-----print array starting from first element---------
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++) {
            System.out.print(intArray[i] + "  ");
        }
        System.out.println();
        //----------print array starting from last element----
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--) {
            System.out.print(intArray[i] + "  ");
        }

    }
}



