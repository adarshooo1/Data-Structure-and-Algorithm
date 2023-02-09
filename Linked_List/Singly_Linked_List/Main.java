package Linked_List.Singly_Linked_List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Single Linked List -> where Head it at the very first index and tail is the very last index in the list. These are called nodes.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(31);
        list.add(41);

        list.addLast(19900);
        System.out.println(list);

        list.addFirst(300);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
