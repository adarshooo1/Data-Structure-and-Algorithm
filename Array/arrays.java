package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public  static void main(String[] args) {
//      Array is a Data structure in which we store similar type of objects.
//      Array with size 5.
        int[] arr = new int[5];
        arr[0] = 121;
        arr[1] = 122;
        arr[2] = 123;
        arr[3] = 124;
        arr[4] = 223;
        System.out.println(arr[2]); //Like this way we can print an Element by accessing it separately
        arr[2] = 1000; //Array can be easily modified and items in array are very fast to access because of limited size.
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr)); //Like this the easiest way to print array in a nice manner.

        for(int i = 0;i < arr.length;i++){ //Like this wa with the help of loop we can iterate over the array.
            System.out.println(arr[i]);  //This will print all the element in the array.
        }

        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in); //Scanner for taking the input from user from the keyboard;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();//Take input for every index in the array
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");// Print output separated with space in a single line.
        }
        for (int num : arr2) {
            System.out.print(num + " ");//Enhanced for loop
        }

        String[] str = new String[5];
        str[0] = "Adarsh";
        str[1] = "Aman";
        str[2] = "Vivek";
        str[3] = "Pawn";
        str[4] = "Galvin";

        System.out.println(Arrays.toString(str));

        for (String obj : str) {
            System.out.print(obj + " ");
        }

        int[] arr3 = {1,2,3,4,5}; //Like this wat we can simply define an array with a similar type of Object in it.
        System.out.println(Arrays.toString(arr3));// This is print the Element inside this array
        change(arr3);// Arrays are mutable in nature and can be change the item inside the array with the help of indexing.
        System.out.println(Arrays.toString(arr3));// Element changed



    }
    static void change(int[] arr){ //Function which will change the element inside an array
        arr[1] = 999;
    }

}
