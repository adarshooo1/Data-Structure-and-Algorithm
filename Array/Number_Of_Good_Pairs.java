//https://leetcode.com/problems/number-of-good-pairs/description/
package Array;

public class Number_Of_Good_Pairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 3};
        int Answer = goodPairs(arr);
        System.out.println(Answer);
    }

    static int goodPairs(int[] nums) {
        int pairCount = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    j++;
                }
                if (j > i) {
                    if (nums[i] == nums[j]) {
                        pairCount += 1;
                    }
                }
            }
        }
        return pairCount;
    }
}
