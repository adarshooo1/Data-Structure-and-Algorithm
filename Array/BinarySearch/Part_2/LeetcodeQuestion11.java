//Leetcode Question 410,Split Largest sum
package Array.BinarySearch.Part_2;

public class LeetcodeQuestion11 {
    public static void main(String[] args) {
        int[] arr = {10,13,5,32,11};
        int m = 2;
        int ans = splitArray(arr, m);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int j : nums) {// In the end of loop this will have the maximum value of the array which is the array itself
            start = Math.max(start, j);
            end += j;
        }
        //Binary Search
        while (start < end) {
//            try for the middle as a potential answer
            int mid = start + (end - start) / 2;
//            calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            }else {
                end = mid;

            }
        }

        return end;
    }
}
