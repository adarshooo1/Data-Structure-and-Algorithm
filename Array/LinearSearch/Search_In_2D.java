package Array.LinearSearch;

import java.util.Arrays;

public class Search_In_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 45},
                {32, 432, 23},
                {54, 65, 767, 23, 76, 76}
        };
        int[] Check = FindIn2d(arr, 767);
        System.out.println(Arrays.toString(Check));
    }

    static int[] FindIn2d(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};


        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
