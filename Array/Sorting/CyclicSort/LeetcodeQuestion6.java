//https://leetcode.com/problems/first-missing-positive/
package Array.Sorting.CyclicSort;

/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
*/

public class LeetcodeQuestion6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 5, 6};
        int answer = firstMissingPositive(arr);
        System.out.println(answer);

    }

    // Define a function that takes an integer array and returns an integer
    static int firstMissingPositive(int[] nums) {
        int i = 0;

        // Iterate over the array
        while (i < nums.length) {
            // Calculate the correct index of the current element
            int correct = nums[i] - 1;

            // Check if the current element is in the correct range and is not already at its correct index
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct] ) {
                // Swap the current element with the element at its correct index
                swap(nums, i, correct);
            } else {
                // If the current element is already at its correct index or is out of range, move to the next element
                i++;
            }
        }

        // Iterate over the array again
        for (int num = 0; num < nums.length; num++) {
            // If the current element is not in its correct position, return the missing positive integer
            if (nums[num] != num + 1) {
                return num + 1;
            }
        }

        // If all the elements are in their correct position, the missing positive integer is the length of the array plus one
        return nums.length + 1;
    }

    // Define a function to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}