//https://leetcode.com/problems/richest-customer-wealth/
package Array;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4},{4, 2, 6}};
        int Answer = MaxWealth(arr);
        System.out.println(Answer);
    }

    static int MaxWealth(int[][] accounts) {
        int Max = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int accountSum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                accountSum += accounts[row][col];
            }
            if (accountSum > Max) {
                Max = accountSum;
            }
        }
        return Max;
    }
}
