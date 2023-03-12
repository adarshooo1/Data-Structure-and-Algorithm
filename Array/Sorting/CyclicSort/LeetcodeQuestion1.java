
package Array.Sorting.CyclicSort;

/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

        Example 1:

        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

        Example 2:

        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 */
public class LeetcodeQuestion1 {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        int Answer = findMissing(arr); // calling findMissing() method to get the missing number
        System.out.println(Answer); // printing the missing number
    }

    static int findMissing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]; // assigning the current element of nums to correct variable
            if (nums[i] < nums.length && nums[i] != nums[correct]) { // if current element is not at its correct position
                swap(nums, i, correct); // swap current element with the element at its correct position
            } else {
                i++; // move to the next element
            }
        }
        for (int index = 0; index < nums.length; index++) { // iterating over the sorted nums array
            if (nums[index] != index) { // if the current element is not equal to its index
                return index; // return the index as the missing number
            }
        }
        return nums.length; // if no number is missing in the array, return the length of the array
    }

    static void swap(int[] nums, int num1, int num2) { // swap method to swap two elements in the array
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}


