//Leetcode Question 162,852.Find Peak Element/Bio-tonic array/Mountain Array
package Array.BinarySearch.Part_2;

public class   LeetcodeQuestion1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 3, 1};
        int ans = peakIndex(nums);
        System.out.println(ans);
    }

    static int peakIndex(int[] arr) {
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
        return start;// or we can also return the end as well; because we know that we are shortening the range
    }

}
