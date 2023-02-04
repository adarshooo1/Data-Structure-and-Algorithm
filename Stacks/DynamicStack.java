package Stacks;


import java.util.Arrays;

public class DynamicStack extends CustomStack {

     public DynamicStack() {
          super(); //It will call CustomStack() which is without parameter.
     }

     public DynamicStack(int size) {
          super(size); //It will call CustomStack(int size) which having the size parameter in the Argument.
     }

/*   Here we override the push method because when we push the element in the array and array gets full while pushing
     then we have to what then override will work and pushing element in the array*/
     @Override
     public boolean push(int item) {
//          This will take care of if the array gets full then copy the element of previous item in the new Array;
          if (this.isFull()) {
//             This will double the size means length of the New array if the array is full.
               int[] temp = new int[data.length * 2];

     //   This will copy the previous array elements
//               for (int i = 0; i < data.length; i++) {
//                    temp[i] = data[i];
//               }
     //   This will also copy the previous array element in the new Array
               System.arraycopy(data, 0, temp, 0, data.length);
               data = temp;
          }
//          Now the size is increased, and we have to insert item at this point we know that array is not full.
          return super.push(item);
     }

     public static void main(String[] args) throws CustomException { //Throws Custom Exception
          DynamicStack dynamcisStacks = new DynamicStack();
          dynamcisStacks.push(12);
          dynamcisStacks.push(122);
          dynamcisStacks.push(132);
          dynamcisStacks.push(112);
          dynamcisStacks.push(142);
          dynamcisStacks.push(22);
          dynamcisStacks.push(32);
          dynamcisStacks.push(42);
          dynamcisStacks.push(52);
          dynamcisStacks.push(92);
          dynamcisStacks.push(152);
          dynamcisStacks.push(126);
          dynamcisStacks.push(123);
          dynamcisStacks.push(127);
          dynamcisStacks.push(232);
          dynamcisStacks.push(322);
          dynamcisStacks.push(234);
          dynamcisStacks.push(545);
          dynamcisStacks.push(1000);
          dynamcisStacks.push(1254);
          dynamcisStacks.push(6453);
          dynamcisStacks.push(672);
          dynamcisStacks.push(212);
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.pop());
          System.out.println(dynamcisStacks.peek());
     }
}
