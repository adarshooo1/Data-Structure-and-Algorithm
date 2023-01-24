//Leetcode Question:-Floor of a number
package Array.BinarySearch.Part_2;

public class LeetcodeQuestion3 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 9, 11, 14, 19, 21, 34};
        int check = floor(nums, 20);
        System.out.println(check);
    }

    static int floor(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start] || target > arr[end]) {//If the number is more or less than the number inside the array then it will print -1.
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return end;//When conditions will not satisfied then at which index start overlap end.It will return the end;
    }
}

