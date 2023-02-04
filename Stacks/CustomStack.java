package Stacks;

import java.util.Arrays;

public class CustomStack {

//  Internally Stack is a type of Array, that's why we are providing an Array as a Datatype.
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

//  This is an empty Constructor when we will create an empty constructor then it will be default sized that we have set. In this case Here Default Size is 10;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

//  This is pointer which starts from -1; Because indexing starts from 0 and goes to N number of times.
    int ptr = -1;

//  This is Constructor which is taking a parameter of type int which will take size which user want to define.
    public CustomStack(int size){
        this.data = new int[size];
    }

//  This push method will help in to add the item in the CustomStack
    public boolean push(int item) {
//      This will give exception if the element
        if (isFull()) {
            System.out.println("Stack Is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }
//  pop is a method which will discard the item at top.As well as it is Extending a customException class which is created by use which will through the error is the customStack is empty but still we want to pop then through exception:- Stack is empty.
    public int pop() throws CustomException {
        if (isEmpty()) {
            throw new CustomException("Cannot pop form an Empty Stack");
        }
//        //Way 1.
//        int removed = data[ptr];
//        ptr--;
//        return removed;
//        //Way 2.
        return data[ptr--];
    }
//  Peek Method that will find the peek in the stack
    public int peek() throws CustomException {
        if (isEmpty()) {
            throw new CustomException("Cannot find peek form an Empty Stack");
        }
        return data[ptr];
    }
    //  This will return true if the stack is full else false.
    public boolean isFull() {
        return ptr == data.length - 1;
    }
//  This will return false if the stack has some item in it, else false.
    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) throws CustomException {
//      Using CustomStack its properties
        CustomStack stack = new CustomStack();
        stack.push(12);
        stack.push(39);
        stack.push(122);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

