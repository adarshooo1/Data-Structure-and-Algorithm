//https://leetcode.com/problems/build-array-from-permutation/
package Array;

import java.util.Arrays;

public class Build_Array_From_Permutation {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 0, 5};
        int[] newArray = ArrayPermutation(arr);
        System.out.println(Arrays.toString(newArray));

    }

    static int[] ArrayPermutation(int[] nums) {
        int[] Array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Array[i] = nums[nums[i]];
        }
        return Array;
    }
}
