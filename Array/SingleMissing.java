//https://leetcode.com/problems/single-number/description/
package Array;
/*  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Example 1:
        Input: nums = [2,2,1]
        Output: 1

        Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4 */

// This program finds the single number in an array that has all other elements repeated twice.
public class SingleMissing {
    public static void main(String[] args) {
        // Create an array with some elements
        int[] arr = {1, 2, 4, 1, 2, 3};

        // Call the method to find the single number
        int singleNum = singleNumber(arr);

        // Print the result
        System.out.println("Single number in the array: " + singleNum);
    }

    // This method finds the single number in the array
    static int singleNumber(int[] nums) {
        int result = 0; // Initialize the result to 0

        // Loop through each element of the array
        for (int i = 0; i < nums.length; i++) {
            boolean foundDuplicate = false; // Initialize the flag for finding duplicates to false

            // Loop through each element of the array again
            for (int j = 0; j < nums.length; j++) {
                // If the current element is not the same as the one being checked, but it is a duplicate, set the flag to true
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break; // Exit the inner loop, since a duplicate was found
                }
            }

            // If no duplicate was found, set the result to the current element and exit the outer loop
            if (!foundDuplicate) {
                result = nums[i];
                break;
            }
        }

        // Return the single number
        return result;
    }
}

