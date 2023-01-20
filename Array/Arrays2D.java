package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
//       Multi-Dimensional array means index of Array an Array itself.
        int[][] arr = new int[3][]; //Let's break down this.
//                    new int[3][] which means array till index 3. At every index there is an Array Also like at index[0] = {2,3,4,5} size can be anything
//        at index arr[1] = {9,0,8,5,4,3,2,1} size is not defined as well not compulsory to define.And so on with arr[2].

        int[][] arr2 = {
                {1, 2, 3, 4, 5}, //Array of index 0
                {6, 7, 8, 9, 10}, //Array of index 1
                {11, 12, 13}, //Array of index 2
                {14, 15, 16, 17, 18, 19}, //Array of index 3
                {20, 21, 22, 23, 24, 25, 25, 27, 28, 29} //Array of index 4
        };
//        This means array of size 5 which and at every index there is an Array itself.
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
//        Enhanced way to print number inside a 2D array with the help of for each loop.
        for (int i = 0; i < arr2.length; i++) {
            for (int num : arr2[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
//        More Enhanced way to print this.
        for (int[] a : arr2) {
            System.out.println(Arrays.toString(a));
        }





        Scanner sc = new Scanner(System.in);
        int[][] arr3 = new int[4][4];

//      Input from user:
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = sc.nextInt();
            }
        }
//      Print the Input
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }
//      Print the input more pretty form
        for (int row = 0; row < arr3.length; row++) {
                System.out.println(Arrays.toString(arr3[row]));
        }
//      With the help of for each loop and arrays toString method.
        for (int[] num : arr3) {
            System.out.println(Arrays.toString(num));
        }
    }
}
