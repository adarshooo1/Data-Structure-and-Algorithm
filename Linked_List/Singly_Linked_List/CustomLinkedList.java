package Linked_List.Singly_Linked_List;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

//  How to create a custom Linked-List
    public CustomLinkedList() {
        this.size = 0;
    }
//  Insert the item at the very first which means the Head.
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
//  To insert the element at the last node of the Linked-List.
    public void insertLast(int val) {

//      An edge case, In case the Linked-List is empty then insert the item at the very first index which means at head.
        if (tail == null) {
            insertFirst(val);
            return;
        }
//      If we want to insert item at the last or we can say at tail then we have to create a new Node give the item inside the parameter.
        Node node = new Node(val);
//      After that then tail next will be that item which we want to insert
        tail.next = node;
//      Now the node it at the tail which is the end element in the Linked-List.
        tail = node;
//      Which means increase the size of the Linked-List.
        size++;
    }

//  Insert the element in the mid of the Linked-List.
    private void insertMid(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

//  Delete the first element from the node of the Linked-List
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    //  Delete the Last element from the node of the Linked-List
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node SecondLast = get(size - 2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;
    }

//
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

//  To delete the item form the mid of the Linked-List.
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }


//  This is to get the index of the Linked-List
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
//  This will display the whole item in the Linked-List
    public void Display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

//  A node in a single linked-list refers to the contact point where the objects are connected with each other.
//  In Single Linked-List Node knows its value and the next item value only.
    private class Node {

//      This is for the current item
        private int value;
//      This is for the next item
        private Node next;

//
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList lst = new CustomLinkedList();
        lst.insertFirst(3);
        lst.insertFirst(4);
        lst.insertFirst(5);
        lst.insertFirst(6);
        lst.insertFirst(19);

        lst.Display();

//      Insert a value at end of the Node in the Linked-List
        lst.insertLast(100);
        lst.Display();

//      Insert a value at any index in Linked List.
        lst.insertMid(1000, 3);
        lst.Display();

//      Delete First Method in Linked List.
        System.out.println(lst.deleteFirst());
        lst.Display();

//      Delete Last Method in Linked List.
        System.out.println(lst.deleteLast());
        lst.Display();

//      Delete from specific index
        System.out.println(lst.delete(4));
        lst.Display();

    }
}
