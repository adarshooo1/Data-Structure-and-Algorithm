package Array.LinearSearch;

public class FIndMax_In_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 45},
                {32, 432, -5},
                {54, 65, 767, -20, 76, 76}
        };
        int Check = findMaxIn2d(arr);
        System.out.println(Check);
    }

    static int findMaxIn2d(int[][] arr) {
        int MaxValue = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            int col = 0;
            while (col < ints.length) {
                if (MaxValue < ints[col]) {
                    MaxValue = ints[col];
                }
                col++;
            }
        }
        return MaxValue;
        }
    }

