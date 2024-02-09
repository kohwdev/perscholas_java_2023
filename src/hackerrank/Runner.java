package hackerrank;

import hackerrank.NumericDataType;

public class Runner {
    public static void main(String[] args) {

//        StringDataType<String> str = new StringDataType<>();
//        str.addition("hello", "world");

        NumericDataType<Integer> num1 = new NumericDataType<>();
        NumericDataType<Long> num2 = new NumericDataType<>();
        NumericDataType<Double> num3 = new NumericDataType<>();
        num1.addition(1, 2);
        num2.addition(21231233123L, 12412412525L);
        num3.addition(2.2, 5.5);


    }
}
