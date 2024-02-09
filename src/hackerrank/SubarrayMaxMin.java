package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayMaxMin {
    // Given an array, for each of its subarrays of a given length, find minimum element.
    // Of all found minimums, determine the maximum.
    // first subarray starts at i = 0, and successive subarrays start at 1, 2 ...
    // until last element of the sub array is the last element of the array

    /*
    n = 5 , number of elements
    arr = [1,2,3,4,5]
    k = 2 , subarray size

    subarrays: [1,2] [2,3] [3,4] [4,5]
    minima: [1,2,3,4]
    maximum of minima: [4]
     */

    public static void main(String[] args) {
        int n = 5;
        List<Integer> arr = new ArrayList<>();
        int k = 2;

        for (int i = 0; i < n; i++) {
            arr.add(i+1);
        }

        System.out.println(arr);



        System.out.println(arr.subList(0,2));



        }




    }
