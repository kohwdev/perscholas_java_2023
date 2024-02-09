package module303.collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
    public static void main(String[] args) {

        /* Declare and initialize the List. */
//        List<String> listObj =   Arrays.asList("Java", "Python", "JavaScript", "ReactJs");
//        System.out.println(listObj);

        /* Declare and initialize the ArrayList. */
//        ArrayList<Integer> intList =  new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
//        System.out.println(intList);


        /*ArrayList<String> al=new ArrayList<>();
        al.add("Jack");  al.add("Tyler");
        al.add("James");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }*/

        ArrayList<String> al=new ArrayList<>();
        al.add("Jack");
        al.add("Tyler");
        al.add("James");

    // Enhanced for each loop
        for (String st:  al) {
            System.out.println(st);
        }



    }
}
