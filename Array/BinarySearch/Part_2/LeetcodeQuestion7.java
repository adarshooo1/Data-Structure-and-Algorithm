//Leetcode Question 1095.FInd the Element in the mountain array.
package Array.BinarySearch.Part_2;

import java.util.Arrays;

public class LeetcodeQuestion7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2};
        int[] ans = findElement(arr, 2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findElement(int[] arr, int target) {
        int Peak = PeakNumber(arr);

        int[] ans = {-1, -1};

         ans[0] =BinarySearch(arr, target, 0, Peak);
         ans[1] =BinarySearch(arr, target, Peak + 1, arr.length - 1);
         return ans ;

    }
    static int BinarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];//Creating a check if this condition satisfies then perform this step else some other step.
        while (start <= end) {//This check is mandatory. Because it will help index to compare and iterate over the whole array.
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;//This is common for both of the conditions.
            }
            if(isAsc){//If condition match perform this step.
                if (arr[mid] < target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            else{//If conditions not match perform this step.
                if (arr[mid] > target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }
        return -1;
    }

    static int PeakNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
