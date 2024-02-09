package module303;

public class GenericRunner {
    public static void main(String[] args) {
        System.out.println( "===invoking regular method========" );
        GenericMethodExample obj = new GenericMethodExample();
        obj.printValues(43); //of type Integer
        obj.printValues("Programmer"); //of type String
        obj.printValues(54.43); //of type Double
        obj.printValues(true); //of type Boolean

        System.out.println( "===invoking static method========" );
        GenericMethodExample.staticDisplayData(254);
        GenericMethodExample.staticDisplayData("Java Developer");
        GenericMethodExample.staticDisplayData(254.25);

        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A'};
        System.out.println( "Printing Integer Array" );
        obj.printArray( intArray  );
        System.out.println( "Printing Character Array" );
        obj. printArray( charArray );

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class again
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java");

        ElephantItem<Integer> ObjMove = new ElephantItem<>();
        ObjMove.move(5, "NYC");
        System.out.println( ObjMove.getItemBeingMoved()   + " Item");
        System.out.println(ObjMove.getLocationBeingMovedTo()  +" Location");





    }
}

