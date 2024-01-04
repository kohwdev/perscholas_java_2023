package module303;

public class WrapperExamples {
    public static void main(String[] args) {
        //The primitives have their wrapper classes
        /*
        int Integer
        byte Byte
        short Short
        long Long
        float Float
        double Double
        boolean Boolean
        char Character
        */

        //Autoboxing - automatically converts primitive values to their matching wrapper objects
        int myValue = 12;
        Integer myObject = Integer.valueOf(100);
        //Integer myObject = new Integer(100)
        myObject = myValue;

        byte b = 100;
        Byte bb = 100;
        short s = 100;
        Short ss = 100;
        int i = 100;  // primitive data type
        Integer ii = 100;  // literal method
        long l = 100l;
        Long ll = 100l;
        float f = 100.0f;
        Float ff = 21.24f;
        double d = 546.32;
        Double dd = 545.255;
        char ch = 'a';
        Character cha = 'a';
        boolean bo = true;
        Boolean boo = true;


        //autoboxing
        int a = 20;
        Integer convertintoInteger = a;

        char c = 'A';
        Character convertintoChar = c;

        double x = 565.23;
        Double convertintoDouble = x;

        //unboxing
        Integer j = 56;
        int jj = j;

        Character C = 'a';
        char chC = c;

        Double D = 2563.32;
        double DD = D;

        //Max value of an integer
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        String myString = "123";
        int inputValue = Integer.parseInt(myString);


    }
}
