//https://leetcode.com/problems/set-mismatch
package Array.Sorting.CyclicSort;

import java.util.Arrays;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

        You are given an integer array nums representing the data status of this set after the error.

        Find the number that occurs twice and the number that is missing and return them in the form of an array.

        Example 1:

        Input: nums = [1,2,2,4]
        Output: [2,3]

        Example 2:

        Input: nums = [1,1]
        Output: [1,2]
*/
public class LeetcodeQuestion5 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5, 2, 7};
        int[] answer = findErrorNums(arr);
        System.out.println(Arrays.toString(answer));

    }

    // This method takes an array of integers as input and returns an array of two integers.
    // The first integer is the number that is duplicated in the input array and the second integer is the number that is missing in the input array.
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        // Loop over the input array to move each number to its correct index position in the array.
        while (i < nums.length) {
            // Calculate the correct index for the current number by subtracting 1 from the number itself.
            int correct = nums[i] - 1;
            // If the current number is not at its correct index position, swap it with the number at its correct position.
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                // If the current number is already at its correct position, move to the next number.
                i++;
            }
        }
        // After sorting the array, find the first number that is out of place.
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                // If a number is out of place, return an array with that number and the number that is missing.
                return new int[]{nums[index], index + 1};
            }
        }
        // If no numbers are out of place, return an array with -1 as both elements.
        return new int[]{-1, -1};
    }

    // This method swaps two numbers in the array given their indices.
    static void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}