package Queues;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;

    protected int front = 0;

    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length;
    }
    //  This will return false if the stack has some item in it, else false.
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int removed = data[front++];

        front = front % data.length;

        size--;

        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(4);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);

//        queue.remove();
//
//        System.out.println(queue.remove());

        queue.display();

        System.out.println(queue.remove());

        queue.display();

        queue.insert(100);

        System.out.println(queue.remove());

        queue.display();



    }

}
