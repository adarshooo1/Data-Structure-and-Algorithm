package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//A Deque (Double Ended Queue) is a linear data structure in Java that allows insertion and removal of elements
//from both ends. It follows the First-In-First-Out (FIFO) principle, but elements can be added or removed from
//both the front and back ends. Deque implements the Deque interface and can be implemented using an Array or a Linked List

public class Deque_In_Queue {
    public static void main(String[] args) {
//      How to Declare a Deque:
        Deque<Integer> Deck = new ArrayDeque<>();
/*      Resizable-array implementation of the Deque interface. Array deque have no capacity restrictions;
        they grow as necessary to support usage. They are not thread-safe; in the absence of external synchronization,
        they do not support concurrent access by multiple threads. Null elements are prohibited. This class is likely
        to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.*/

//      It is faster than Stack and Linked-list as it gives as to do insertion and removal from both the end
//      Null element are not allowed in this;
//      It is not thread safe either.
//      It has no capacity restriction



        Deck.addFirst(12); //addFirst will add the item in the very first index.
        Deck.addLast(200);//addLast will add the item in the very last index.
        Deck.addFirst(19);
        Deck.addLast(532);
        Deck.addFirst(50);
        Deck.addLast(232);
        System.out.println(Deck);

        System.out.println(Deck.pollLast());//It will remove the very last item from the Deque
        System.out.println(Deck.poll());//It will remove the very First item from the Deque
        System.out.println(Deck.offerFirst(1000));//It will add the item in the first index in the Deque and return the Boolean Expression while adding the item.
        System.out.println(Deck.offer(2000));//It will add the item in the last index in the Deque and return the Boolean Expression while adding the item.
        System.out.println(Deck);
        System.out.println(Deck.peekFirst());

        System.out.println(Deck.element());//Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
//      This method is equivalent to peekFirst().

        System.out.println(Deck);
        System.out.println(Deck.pop()); //It will remove the first item from the Deque.
        System.out.println(Deck);



    }

}
