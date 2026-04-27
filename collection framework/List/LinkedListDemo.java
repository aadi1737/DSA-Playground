package List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // In java Collection Framework it is a Doubly Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(4129);
        linkedList.add(5);
        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println("Index of ele '5' is:"+linkedList.indexOf(5));
        System.out.println("Last Index of ele '5' is:"+linkedList.lastIndexOf(5));
    }
}
