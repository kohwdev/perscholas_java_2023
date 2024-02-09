package module303.collections_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>(); use either one
        //Default constructor:
        ArrayList<String> myList = new ArrayList<String>();
        //capacity constructor:
        ArrayList<String> myList2 = new ArrayList<>(100);
        //populating constructor - collection:
        ArrayList<String> myList3 = new ArrayList<>(myList2);
        myList.add("New Jersey");
        myList.add("Dallas");
        myList.add("New York");
        myList.add("Chicago");
        myList.add("LA");
        System.out.println("Return boolean :" + myList.contains("Chicago"));
        System.out.println("Return index value of Element :" + myList.indexOf("Chicago"));
        System.out.println("Returns the actual Element at the given index :" + myList.get(2));
        System.out.println("Returns the length of the arraylist :" + myList.size());
        // Remove the element at the given index.   Returns the removed element.
        boolean isRemoved = myList.remove("Georgia");
        System.out.println(isRemoved);
        // remove element at index 3
        String removedElement =  myList.remove(3);
        System.out.println("Removed Element: " + removedElement);
        // remove all elements
        // set a value to Georgia:
        myList.set(0, "Georgia");
        System.out.println("ArrayList before clear(): " + myList);

        //sorted list
        Collections.sort(myList);
        System.out.println("ArrayList after sorting: " + myList);

        myList.clear();
        System.out.println("ArrayList after clear(): " + myList);
    }

}
