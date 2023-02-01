//https://leetcode.com/problems/rotate-array/submissions/
package Array;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 5, 6, 7, 8, 9};
        int times = 5;

        rotateArray(arr, times);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int times) {

//      Check for the number of rotation; Like times = 10 and arr size is 8.So, 10 % 8 = 2,
//      which means when we rotate an array by 2 times then it will be exactly like the 8th rotation.
        times = times % arr.length ;

//     check 1: Using reverse function to reverse the whole array;
        reverse(arr, 0, arr.length - 1);
//     Check 2: Using reverse function, reverse the array till start from number of times-1(Which is the exact position of the element till we have to rotate)
        reverse(arr, 0, times - 1);
//     Check 3: Using reverse function, reverse the array start from number of time its said to be rotated  till arrays length -1
        reverse(arr, times, arr.length - 1);
    }
//    Function to reverse the array;
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


