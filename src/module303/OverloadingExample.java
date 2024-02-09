package module303;

public class OverloadingExample {
    public static void main(String[] args) {

    }

    public static void myMethod(String string1, String string2){
            System.out.println("First string: " +  string1 + "Second string: " + string2 );
    }
    public static void myMethod(String s1, int myInt) {
            System.out.println("First string" + s1+ "Second string" + myInt);
    }

}
