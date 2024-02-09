package module303;

public class GenericClassRunner {
    public static void main(String[] args) {
        //GenericsClass run
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic class returns: " + intObj.getData());

        GenericsClass<String> stringObj = new GenericsClass<>("Java");
        System.out.println("Generic class returns: " + stringObj.getData());
    }
}
