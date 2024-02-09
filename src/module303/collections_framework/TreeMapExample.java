package module303.collections_framework;

import java.util.TreeMap;

public class TreeMapExample {
    //implements Map<K,V> interface similar to HashMap class. Unlike HashMap,
    // TreeMap is sorted in the ascending order of its keys.
    // Duplicate keys are not possible - only unique keys
    // it cannot have a null key, but can have multiple null values
    // it stores the keys in a sorted order or by a comparator provided at map creation time
    /*
    entrySet()
    keySet()
    values()
    void size()
    void isEmpty()
    boolean containsKey (Object key)
    boolean containsValue (Object key)
    get (Object key)




     */
    public static void main(String[] args) {

        TreeMap<Integer, String> mapObj = new TreeMap<>();
        mapObj.put(1, "Per Scholas New Yok, NY");
        mapObj.put(2, "Per Scholas Atlanta GA");
        mapObj.put(3, "Per Scholas Columbas, OH");
        mapObj.put(3, "Per Scholas  Florida, Orlando");
        mapObj.put(4, "Per Scholas Chicago, Ill");
        mapObj.put(5, "Per Scholas Chicago, Ill");
        mapObj.put(1, "Per Scholas New Jersey , NJ");
        // mapObj.put(null, "Per Scholas Dallas , TX");
        mapObj.put(6, null);
        mapObj.put(7, null);
        System.out.println(mapObj);


        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());
        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());
        // Using values()
        System.out.println("Values: " + numbers.values());

    }
}
