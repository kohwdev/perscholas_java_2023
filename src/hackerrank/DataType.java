package hackerrank;



interface DataType<T> {
    void addition(T a, T b);
    void subtraction(T a, T b);
    void multiplication(T a, T b);
    void division(T a, T b);
}

class StringDataType<T> implements DataType<T> {

    @Override
    public void addition(T a, T b) {
        //It should first print the following "Adding two strings"
        System.out.println("Adding two strings.");
        //It should print the concatenation of the two parameters, (a+b) in the following format: "The result is: {result}".
        String result = String.valueOf(a) + b;
        System.out.println("The result is: " + result);
    }

    @Override
    public void subtraction(T a, T b) {
        //It should print "Can't perform this operation on strings
        System.out.println("Can't perform this operation on strings");
    }

    @Override
    public void multiplication(T a, T b) {
        //It should print "Can't perform this operation on strings
        System.out.println("Can't perform this operation on strings");


    }

    @Override
    public void division(T a, T b) {
        //It should print "Can't perform this operation on strings
        System.out.println("Can't perform this operation on strings");


    }
    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);

    }

}

class NumericDataType<T extends Number> implements DataType<T> {
    public void addition(T a, T b) {
        System.out.println("Adding 2 generic instances");
        double result = a.doubleValue() + b.doubleValue();
        System.out.printf("The result is: %.2f%n", result);

    }

    public void subtraction(T a, T b) {
        System.out.println("Subtracting two generic instances");
        double result = a.doubleValue() - b.doubleValue();
        System.out.printf("The result is: %.2f%n", result);
    }

    public void multiplication(T a, T b) {
        System.out.println("Multiplying two generic instances");
        double result = a.doubleValue() * b.doubleValue();
        System.out.printf("The result is: %.2f%n", result);

    }

    public void division(T a, T b) {
        System.out.println("Dividing two generic instances");
        double result = a.doubleValue() / b.doubleValue();
        System.out.printf("The result is: %.2f%n", result);

    }

    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }

}

/*
The NumericDataType<T> generic class should implement the generic interface DataType,
should have no class variables, but should implement the following methods:
    void addition(T a, T b):
    it should first print the following "Adding 2 generic instances"
    it should print the sum of two parameters, up to two digits of decimal, in the following format:
    "The result is: {result}"

NumericDataType can be used for integers, long integers, or double values
 */