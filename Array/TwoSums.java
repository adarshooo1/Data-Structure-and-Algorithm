//https://leetcode.com/problems/two-sum/submissions/886752973/
package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        int target = 6;
        int[] Answer = twoSum(arr, target);
        System.out.println(Arrays.toString(Answer));

        int[] arr2 = {1, 2, 5, 4, 7, 8, 3, 6, 9};
        int[] ans2 = twoSum2(arr2, 16);
        System.out.println(Arrays.toString(ans2));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ans3 = twoSum3(arr3, 15);
        System.out.println(Arrays.toString(ans3));
    }


    // Brute Force Solution
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //Better Approach for sorted But optimal approach for un-sorted array;
    static int[] twoSum2(int[] arr, int target) {
        Map<Integer, Integer> Indexes = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = target - arr[i];
            if (Indexes.containsKey(element)) {
                return new int[]{Indexes.get(element), i};
            }
            Indexes.put(arr[i], i);
        }
        return new int[]{};
    }

    //Optimal Approach but only suitable for Sorted array
    static int[] twoSum3(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return new int[]{start, end};
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{0, 0};
    }
}
