package module303.array_processing_manipulation;

import java.util.Arrays;

public class InsertDeleteArrayElement {
    public static void main(String[] args) {
        int[] array = {10, 25, 36, 58, 96, 74, 110};

        int removeindex = 1;
        for (int i = removeindex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        System.out.println("25 is deleted from index 1 " + Arrays.toString(array));




        int x = 28;
        int myArray[]    = {0, 1, 2, 45, 7, 5, 17};
        // create a new array of  bigger size (n+1)

        int newArray[] = new int[myArray.length + 1];
        // insert the elements from the old array into the new one
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
            newArray[myArray.length] = x;
        }
        System.out.println("28 is inserted --> "+ Arrays.toString(newArray));

    }
}
