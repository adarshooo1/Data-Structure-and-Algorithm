//https://leetcode.com/problems/two-sum/submissions/886752973/
package Array;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        int target = 6;
        int[] Answer = twoSum(arr, target);
        System.out.println(Arrays.toString(Answer));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    if (i == j) {
                        continue;
                    }
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
