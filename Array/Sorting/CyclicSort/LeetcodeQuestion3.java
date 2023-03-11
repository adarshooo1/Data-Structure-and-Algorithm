//https://leetcode.com/problems/find-the-duplicate-number/
package Array.Sorting.CyclicSort;

/*  Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

        There is only one repeated number in nums, return this repeated number.

        You must solve the problem without modifying the array nums and uses only constant extra space.

        Example 1:

        Input: nums = [1,3,4,2,2]
        Output: 2
        Example 2:

        Input: nums = [3,1,3,4,2]
        Output: 3       */

public class LeetcodeQuestion3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 1, 5, 9, 8};
        int answer = findDuplicate(arr);
        System.out.println(answer);

    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i+1) {
                // Calculate the correct index for the current element
                int correct = nums[i] - 1;

                // If the current element is not in its correct position, swap it
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
                // If the current element is already in its correct position, move to the next element
            }else {
                i++;
            }
        }
        return -1;
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

