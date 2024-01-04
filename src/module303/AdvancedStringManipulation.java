package module303;

import java.util.StringJoiner;

public class AdvancedStringManipulation {
    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer(50);
//        stringBuffer.append("hello world");
        //StringBuffer is synchronized

        // ------ insert()----------------
        StringBuffer s = new StringBuffer("Java");
        s.insert(4, "language");
        System.out.println(s);
        // --------- replace()---------
        StringBuffer sT = new StringBuffer("Java");
        sT.replace(0, 2, "Hello");
        System.out.println(sT);

        StringBuffer str = new StringBuffer("Welcome to Java Fullstack ");
        System.out.println("Original string: " + str);
        System.out.println("Substring with start index: " + str.substring(5));
        System.out.println("Substring with start and end index: " + str.substring(5, 10));


        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
        // ----Adding values to StringJoiner  ----
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("Javascript");
        System.out.println(joinNames);

        //---- passing comma(,) and square-brackets as delimiter  	----
        StringJoiner joinData = new StringJoiner(",", "[", "]");
        // ---Adding values to StringJoiner  ---
        joinData.add("Java");
        joinData.add("Python");
        joinData.add("C Sharp");
        joinData.add("JavaScript");
        System.out.println(joinData);


    }
}
