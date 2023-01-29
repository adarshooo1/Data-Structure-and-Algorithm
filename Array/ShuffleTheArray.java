//https://leetcode.com/problems/shuffle-the-array/
package Array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 4;
        int[] Answer = shuffle(arr, n);
        System.out.println(Arrays.toString(Answer));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];

        for (int row = 0; row < n; row++) {
            newArray[row * 2] = nums[row];
            newArray[row * 2 + 1] = nums[row + n];
        }
        return newArray;
    }
}
