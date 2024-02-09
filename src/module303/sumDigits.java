package module303;

import java.util.ArrayList;
import java.util.List;

public class sumDigits {
    public static void main(String[] args) {
        int largeNum = 967532;
        int sum = 0;

        // separate the number to digits
        List<Integer> digits = new ArrayList<>();
        while (largeNum > 0) {
            digits.add(largeNum % 10);
            largeNum /= 10;
        }
        System.out.println(digits);

        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }


        System.out.println(sum);




    }
}
