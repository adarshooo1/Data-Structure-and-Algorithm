//Leetcode Question 34.Find First and Last position of element in sorted array.
package Array.BinarySearch.Part_2;

import java.util.Arrays;

public class LeetcodeQuestion5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 6, 6, 6, 6, 6, 6, 8};
        int[] check = numberOccurrence(arr, 6);
        System.out.println(Arrays.toString(check));
    }

    static int[] numberOccurrence(int[] nums, int target) {

        int[] ans = {-1, -1};
//      This search function is like a recursive call, which is calling another function inside from a function.
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
//      While start index is letter then the end index run this loop.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //This else is not returning anything weather it is performing a check itself.
                ans = mid;
                //This check will help in finding the first index of the element int the array.
                if (findStartIndex) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
