package module303;

public class BoundedTypesRunner {
    public static void main(String[] args) {
        // initialize generic class with Integer value
        MathBox<Integer> mObj = new MathBox<Integer>(5);
        // initialize generic class with double value
        MathBox<Double> mObj2 =  new MathBox<Double>(32.1);

        System.out.println(mObj.sqrt());
        System.out.println(mObj2.sqrt());
        //  MathBox mObj3 =  new MathBox<Double>(" Perscholas"); // error
        MathBox<Float> myObj3 = new MathBox<>(1.2F);
        MathBox<Number> myObj4 = new MathBox<>(10);
        MathBox<Integer> myObj5 = new MathBox<>(1);
        
    }

}
