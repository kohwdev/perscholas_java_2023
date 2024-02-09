package module303;

import java.util.ArrayList;
import java.util.List;

public class T {
    public static void main(String[] args) {
        int largeNum = 12345;

        List<Integer> digits = new ArrayList<>();

        while (largeNum > 0) {
            digits.add(largeNum % 10);
            largeNum /= 10;
        }

        System.out.println(digits);

    }
}
