package module303.generic_method_and_class;

public class DemoClass {
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data passed: " + data);
    }

    public static void main(String[] args) {
        DemoClass dObj = new DemoClass();

        dObj.genericsMethod(25);
        dObj.genericsMethod("Per Scholas");
        dObj.genericsMethod(2563.5);
        dObj.genericsMethod('H');
    }
}


