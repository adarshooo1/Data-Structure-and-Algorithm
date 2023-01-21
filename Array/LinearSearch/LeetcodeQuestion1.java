/*Leetcode Questions:-1295.Find with Even Number in Digits */
package Array.LinearSearch;

public class LeetcodeQuestion1 {
    public static void main(String[] args) {
        int[] arr = {-112, 0, 1,9,13,12, 345, 2, 6, 13, 2321, 1234};
        int NumCheck = EvenNum(arr);
        System.out.println(NumCheck);

    }

    static int EvenNum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)%2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int even(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
