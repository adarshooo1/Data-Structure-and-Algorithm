//https://leetcode.com/problems/concatenation-of-array/
package Array;

import java.util.Arrays;

public class Concatenation_Of_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] answer = concatenation(arr);
        System.out.println(Arrays.toString(answer));
    }

    static int[] concatenation(int[] nums) {
        int[] newArray = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
            newArray[i + nums.length] = nums[i];
        }
        return newArray;

    }
}
