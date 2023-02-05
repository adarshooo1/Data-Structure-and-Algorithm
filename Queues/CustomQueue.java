package Queues;

import Stacks.CustomException;
import Stacks.CustomStack;

public class CustomQueue {
    public int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return end == data.length;
    }
    //  This will return false if the stack has some item in it, else false.
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];

    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("[END]");
    }

    public static void main(String[] args) throws Exception {
        CustomQueue CQS = new CustomQueue(5);
        CQS.insert(12);
        CQS.insert(132);
        CQS.insert(142);
        CQS.insert(126);
        CQS.insert(127);

        CQS.display();

        System.out.println(CQS.remove());

        CQS.display();
    }

}
