package Array;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 1, 2, 1};
        int ans = Brute(arr);
        System.out.println(ans);

        int[] arr2 = {102, 4, 100, 1, 101, 3, 1, 2, 1};
        int ans2 = optimal(arr2);
        System.out.println(ans2);

    }

    static int Brute(int[] arr) {
        int longest = 1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            while (linearSearch(arr, arr[i] + 1)) {
                count++;
                arr[i]++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static Boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }


    static int optimal(int[] arr) {
        int longest = 1;
        HashSet<Integer> aSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            aSet.add(arr[i]);
        }

        for (int num : aSet) {
            if (!aSet.contains(num - 1)) {
                int count = 1;
                int x = num;

                while (aSet.contains(x + 1)) {
                    x = x + 1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}