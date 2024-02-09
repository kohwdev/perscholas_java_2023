package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunWithAnagrams {
    public static void main(String[] args) {
        String[] arr = {"code", "doce", "ecod", "framer", "frame"};
        List<String> sortedArr = new ArrayList<>(Arrays.asList(arr));

        //sort the string to easily locate the anagrams
        for (int i = 0; i < sortedArr.size(); i++) {
            char[] temp = arr[i].toCharArray();
            Arrays.sort(temp);
            String newStr = new String(temp);
            sortedArr.set(i, newStr);
        }

        System.out.println(sortedArr);
        //remove duplicates from sorted array
        List<String> result = new ArrayList<>();
        for (String s : sortedArr) {
            if (!result.contains(s)){
                result.add(s);
            }
        }

        // Revert sorted strings to original strings
        for (int i = 0; i < result.size(); i++) {
            int originalIndex = sortedArr.indexOf(result.get(i));
            result.set(i, arr[originalIndex]);
        }

        // Sort the result array in ascending order
        Collections.sort(result);

        // Print the result
        System.out.println(result);





    }

}
