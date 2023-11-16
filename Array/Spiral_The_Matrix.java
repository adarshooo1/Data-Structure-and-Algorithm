package Array;

import java.util.ArrayList;

public class Spiral_The_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ArrayList<Integer> spiral = spiral_Matrix(arr);
        System.out.println(spiral);
    }

    static ArrayList<Integer> spiral_Matrix(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (left <= right && top <= bottom) {
            //Top : Left -> Right;
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            //Right : Top -> bottom;
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            //check
            if (top <= bottom) {
                //Bottom : right -> Left;
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            //check
            if (left <= right) {
                //left : Bottom -> Top;
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
