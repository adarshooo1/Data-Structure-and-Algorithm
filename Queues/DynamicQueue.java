package Queues;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    public boolean insert(int item) {

        if (this.isFull()) {
//             This will double the size means length of the New array if the array is full.
            int[] temp = new int[data.length * 2];

//               This will copy the previous array elements
               for (int i = 0; i < data.length; i++) {
                   temp[i] = data[front + i] % data.length;
               }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicQueue DMQ = new DynamicQueue();//It will take the default size
        DMQ.insert(122);
        DMQ.insert(143);
        DMQ.insert(154);
        DMQ.insert(153);
        DMQ.insert(112);
        DMQ.insert(132);
        DMQ.insert(542);
        DMQ.insert(5432);
        DMQ.insert(53);
        DMQ.insert(12);
        DMQ.insert(22);
        DMQ.insert(76);
        DMQ.insert(90);
        DMQ.insert(9);

        DMQ.display();

        System.out.println(DMQ.remove());

        DMQ.display();


    }

}
