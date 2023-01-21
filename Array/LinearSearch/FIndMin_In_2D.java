package Array.LinearSearch;

public class FIndMin_In_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 45},
                {32, 432, -5},
                {54, 65, 767, -20, 76, 76}
        };
        int Check = findMinIn2d(arr);
        System.out.println(Check);
    }

    static int findMinIn2d(int[][] arr) {
        int MinValue = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (MinValue > arr[row][col]) {
                    MinValue = arr[row][col];
                    }
                }
            }
        return MinValue;
        }
    }

