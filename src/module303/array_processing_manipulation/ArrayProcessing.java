package module303.array_processing_manipulation;

import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        boolean[] boolArr = new boolean[] { true, true, false, true };
        byte[] byteArr = new byte[] { 10, 20, 30 };
        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        float[] floatArr = new float[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        long[] longArr = new long[] { 1, 2, 3, 4 };
        short[] shortArr = new short[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(byteArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(dblArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(longArr));
        System.out.println(Arrays.toString(shortArr));


        int[] dValues = new int[10];
        Arrays.fill(dValues, 6);   // set all values to 6
        for(int i : dValues) {  // print using loop
            System.out.println(dValues[i]);
        }

        long[] lValues = new long[10];
        Arrays.fill(lValues, 2057);    // set all values to 2057
        System.out.println(Arrays.toString(lValues));  // print using toString()

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        // Fill from index 1 to index 4.
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar)); // print using toString()

        //The System.out instance has a special version of println for characters so there is no need to call toString for characters
        //for other types of arrays the println(Object) is called
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);

        System.out.println(Arrays.toString(numbers));
        System.out.println(chars);

    }

}
