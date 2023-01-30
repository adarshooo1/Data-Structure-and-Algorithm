package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class In_Built_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(14);
        queue.add(19);
        queue.add(20);
        queue.add(50);
        System.out.println(queue);
        System.out.println(queue.peek());// This will give the index number from the very first item we push in the queue.
        System.out.println(queue.remove());// This will remove the very first item or index(0) from the queue.As if we give any argument in this method like this:- System.out.println(queue.remove(50)), then it will remove the Item as well as it will return the Boolean Expression if it presents in the queue and remove the item as well from mid or last.
        System.out.println(queue.remove(19));// This will remove the very first item from the queue.As if we give any argument in this method like this:- System.out.println(queue.remove(50)), then it will remove the Item as well as it will return the Boolean Expression if it presents in the queue and remove the item as well from mid or last.
        System.out.println(queue);

        queue.removeAll(queue);//This will remove all the item from the queue and make the queue empty;
        System.out.println(queue);

        queue.add(200);
        queue.add(124);
        queue.add(159);
        queue.add(210);
        queue.add(560);
        System.out.println(queue);
        System.out.println(queue.offer(8)); //It's basically adding the item from the last index.
        System.out.println(queue.remove());
        System.out.println(queue);
        queue.add(100);
        System.out.println(queue);
        System.out.println(queue.poll()); //It's basically remove the item form the first index.
        System.out.println(queue);







        }
    }

