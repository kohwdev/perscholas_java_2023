package module303.collections_framework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Item1");
        linkedList.add("Item3");
        linkedList.add("Item5");
        linkedList.add("Item2");
        linkedList.add("Item4");

        System.out.println("Linked list content: " + linkedList);

        //add first and last element
        linkedList.addFirst("first");
        linkedList.addLast("last");

        System.out.println("After adding first and last element: " + linkedList);

        Object firstVar = linkedList.get(0);
        System.out.println("First element: " + firstVar);

        linkedList.set(0, "changed first item");

        Object firstVar2 = linkedList.get(0);
        System.out.println("after set method: " + firstVar2);

        //remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Linked list after removing first and last element: " + linkedList);

        //add to a position and remove from a position
        linkedList.add(0, "newly added item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);


        //Sort example
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("A");
        linkedList2.add("C");
        linkedList2.add("D");
        linkedList2.add("B");
        linkedList2.add("E");

        //unsorted
        System.out.println(linkedList2);

        //sort the list
        Collections.sort(linkedList2);
        System.out.println(linkedList2);

        //customer sorting
        linkedList2.sort(Collections.reverseOrder());
        System.out.println(linkedList2);



    }
}
