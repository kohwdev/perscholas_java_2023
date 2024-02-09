package module303.collections_framework;

import java.util.HashMap;

public class HashMapExample {

    //capacity - initially capable default capacity given by JVM (default) 16
    //size - set capacity by user, calculates load factor and rebuilds the map with correct size
    public static void main(String[] args) {
        HashMap<Integer, String> mapObj = new HashMap<>();
        mapObj.put(1, "Per Scholas New Yok, NY");
        mapObj.put(2, "Per Scholas Atlanta GA");
        mapObj.put(3, "Per Scholas Columbas, OH");
        mapObj.put(3, "Per Scholas  Florida, Orlando");
        mapObj.put(4, "Per Scholas Chicago, Ill");
        mapObj.put(5, "Per Scholas Chicago, Ill");
        mapObj.put(1, "Per Scholas New Jersey , NJ");
        mapObj.put(null, "Per Scholas Dallas , TX");
        mapObj.put(6, null);
        mapObj.put(null, "Per Scholas Seattle, WA");
        mapObj.put(7,null);

        System.out.println(mapObj);

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // get() method to get value
        String value = languages.get(1);
        System.out.println("Value at index 1: " + value);

        // return set view of keys using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

    }

}
