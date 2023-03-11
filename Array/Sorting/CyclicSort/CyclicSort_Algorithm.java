package Array.Sorting.CyclicSort;

//How to identify CyclicSort Question:-When given number from range 1 to N => use cyclic sort , or called an infinite array

import java.util.Arrays;

public class CyclicSort_Algorithm {
    public static void main(String[] args) {
//        index      0  1  2  3  4  5
        int[] arr = {4, 3, 5, 6, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

//   This will return the unorganised array in the organised manner with the help of cyclic sort
    static void cyclicSort(int[] nums) {
        int i = 0;
         while (i < nums.length) {
             int correctIndex = nums[i] - 1;
             if (nums[i] != nums[correctIndex]) {
                 swap(nums, correctIndex, i);
             }
             else{
                 i++;
             }
         }
    }

//  function to swapping two number
    static void swap(int[] arr , int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
