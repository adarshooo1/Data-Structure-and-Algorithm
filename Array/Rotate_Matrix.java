package Array;

public class Rotate_Matrix {
    public static void main(String[] args) {
//        1, 2, 3, 4
//        5, 6, 7, 8
//        9, 10, 11, 12
//        13, 14, 15, 16

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        rotateMatrixBrute(arr);

        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        rotateMatrixOptimal(arr);

        for (int[] nums : arr) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }

    // TIme complexity O(N^2).
    // Space complexity O(N^2).
    public static void rotateMatrixBrute(int[][] arr) {
        int[][] copyArray = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                copyArray[j][arr.length - 1 - i] = arr[i][j];
            }
        }


        for (int[] nums : copyArray) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    //    Time Complexity: O(N^2)
    //    Space Complexity: O(1)
    public static void rotateMatrixOptimal(int[][] arr) {
        //Transpose Array;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Reverse Array
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;
            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
}
