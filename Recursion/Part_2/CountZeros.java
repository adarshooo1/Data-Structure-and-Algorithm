package Recursion.Part_2;

public class CountZeros {

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int remainder = n % 10;

        if (remainder == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }

    public static void main(String[] args) {
        System.out.println(count(30202202));

    }
}
