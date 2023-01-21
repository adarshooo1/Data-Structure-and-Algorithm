package Array.LinearSearch;

//Leetcode:- 1672.Richest Customer Wealth

public class LeetcodeQuestion2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 6},
                {2, 5, 1},
                {6, 5, 1}
        };
        int MaximumWealth = MaxWealth(arr);
        System.out.println(MaximumWealth);
    }

    static int MaxWealth(int[][] arr) {
        int Max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > Max) {
                Max = sum;
            }
        }
        return Max;
    }
}
