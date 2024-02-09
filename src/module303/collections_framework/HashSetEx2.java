package module303.collections_framework;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();
        //using add()method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Hash set: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        //addAll() method
        //HashSet<Integer> numbers = new HashSet<evenNumber>;
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New Hash set: " + numbers);




    }
}
