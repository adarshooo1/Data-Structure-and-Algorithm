//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
package Array.Sorting.CyclicSort;
/* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

        You must write an algorithm that runs in O(n) time and uses only constant extra space.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]

        Example 2:
        Input: nums = [1,1,2]
        Output: [1]
 */
import java.util.ArrayList;
import java.util.List;

public class LeetcodeQuestion4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 4, 5, 6, 7};
        List<Integer> ans = findRepeatedDuplicate(arr);
        System.out.println(ans);
    }

    // Function to sort the array using cyclic sort and find duplicate numbers and return in a list
    static List<Integer> findRepeatedDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Calculate the correct index for the current element
            int correct = nums[i] - 1;

            // If the current element is not in its correct position, swap it
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            // If the current element is already in its correct position, move to the next element
            else {
                i++;
            }
        }

        // After sorting the array, find all missing numbers and add them to a list
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(nums[index]);
            }
        }

        // Return the list of missing numbers
        return list;
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

