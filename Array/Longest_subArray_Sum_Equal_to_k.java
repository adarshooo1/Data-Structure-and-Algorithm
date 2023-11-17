//https://leetcode.com/problems/subarray-sum-equals-k/
//How many pairs of a sub Array in the array makes sum equal to k.
package Array;

import java.util.HashMap;
import java.util.Map;


public class Longest_subArray_Sum_Equal_to_k {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int ans = subArraySum3(nums, k);
        System.out.println(ans);
    }

    public static int subArraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int K = i; K <= j; K++) {
                    sum += nums[K];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subArraySum2(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subArraySum3(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int count = 0;
        int preSum = 0;

        mpp.put(0, 1);// Setting 0 in the first place. Because adding something with 0, gives same output.
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int remove = preSum - k;

            count += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
