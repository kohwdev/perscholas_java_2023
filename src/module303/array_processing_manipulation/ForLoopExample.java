package module303.array_processing_manipulation;

import java.util.Arrays;

public class ForLoopExample {
    public static void main(String[] args) {
        int[] sourceArrays = {2,3,4,5,10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if (targetArrays == sourceArrays) { //To compare the actual values for equivalence - Arrays.equals(sourceArrays, targetArrays)
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        // clone() method is inherited from Object class
  /*      int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;

        int[] targetArray2 = {4,5,6};

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));*/

        // Deep copy stores copies of the values of the object,
        // shallow copy stores the references of objects to the original in memory.


        /*System.arraycopy(sourceArray, 1, targetArray2, 1, 2);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array2: " + Arrays.toString(targetArray2));*/

        int[] sourceArray = {1,2,3};
        int[] copyOfSource = Arrays.copyOf(sourceArray, 5);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(copyOfSource));







    }
}
