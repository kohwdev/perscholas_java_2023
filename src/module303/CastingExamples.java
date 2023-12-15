package module303;

public class CastingExamples {
    public static void main(String[] args) {
        //Explicit type casting - double, float, long, int, short, byte
        //(target-type)value;
        int x;
        double y = 9.99;
        x = (int)y;

        byte b = 50;
        b = (byte)(b*2); //byte is automatically promoted to int from this expression

        /*Implicit Type casting - automatic conversion by the compiler internally
        happens when two data types are compatible
        We assign value of a smaller data type to a bigger data type
        overflowing in java
         */
        int radius = 20;
        long l = radius;
        float f = l;

        //automatic type promotion in expressions:
        //byte a = 40, b=50, c=100;
        //int d = a * b / c;

    }
}
