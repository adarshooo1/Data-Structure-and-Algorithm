//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package Array;

import java.util.Arrays;

public class Smaller_Then_The_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] Answer = smallerNumber(nums);
        System.out.println(Arrays.toString(Answer));


    }
    static int[] smallerNumber(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count ++;
                }
            }
            newArray[i] = count;
        }
        return newArray;
    }
}
