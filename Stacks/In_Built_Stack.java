package Stacks;

import java.util.Stack;

public class In_Built_Stack {
    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(12);
        newStack.push(33);
        newStack.push(35);
        newStack.push(36);
        newStack.push(37);
        System.out.println(newStack.peek());        //Peek refers to a method which will work according to the Data structure like stack and queue, It will give the item which is in the very last in the stack.
        System.out.println(newStack);               // It will print the item in the stack.
        System.out.println(newStack.search(33));// This will give the index number from the very last or index(arr.length) item we push in the stack.
        System.out.println(newStack.search(12));// This will give the index number from the very last or index(arr.length) item we push in the stack.
        System.out.println(newStack.search(37));// This will give the index number from the very last or index(arr.length) item we push in the stack.

        System.out.print("["+newStack.pop() +", "); //Pop helps to remove item according to the stack.In Stack ti will remove the very last item first.
        System.out.print(newStack.pop() +", ");
        System.out.print(newStack.pop() +", ");
        System.out.print(newStack.pop() +", ");
        System.out.print(newStack.pop() +"]");


//      System.out.println(newStack.pop()); //If nothing in stack is available then we try to remove the item then it will Empty Stack Exception.
    }
}
