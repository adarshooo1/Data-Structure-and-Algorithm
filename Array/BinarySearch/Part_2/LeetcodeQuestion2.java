package Array.BinarySearch.Part_2;

//Leetcode Question Ceiling of a number
public class LeetcodeQuestion2 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 9, 11, 14, 19, 21, 34};
        int check = ceiling(nums, 2);
        System.out.println(check);
    }

    static int ceiling(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[start] || target > arr[end]) {
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
        return start;
    }
}

