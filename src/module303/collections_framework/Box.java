package module303.collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Box <T> {
    List<T> values;
    public Box() {
        values = new ArrayList<T>();
    }
    public void add(T value){
        values.add(value);
    }
    public List<T> get () {
        return values;
    }

    public static void main(String[] args) {
// creating  Generic Instance for box
        Box<Integer> intBox = new Box<Integer>();
        intBox.add(12);
        intBox.add(24);
        intBox.add(42);
        intBox.add(45);
        System.out.println(intBox.get());

// creating  Generic Instance for box
        Box<Float> floatBox = new Box<Float>();
        floatBox.add(12.3f);
        floatBox.add(18.5f);
        floatBox.add(120.45f);
        floatBox.add(85.4f);
        System.out.println(floatBox.get());


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);
        System.out.println("Before : " + numbers);
        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers);
        System.out.println("After : " + numbers);


        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();
        // add elements to ArrayList
        languages.add("Python");
        languages.add("Swift");
        languages.add("C");
        languages.add("JavaScript");
        System.out.println("Unsorted ArrayList: " + languages);
        languages.sort(Comparator.naturalOrder());
        System.out.println(languages);
        // sort the ArrayList in ascending order and then reverse sorted order
        languages.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList: " + languages);


    }

}
