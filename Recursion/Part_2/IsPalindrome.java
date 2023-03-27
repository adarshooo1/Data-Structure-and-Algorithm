package Recursion.Part_2;

public class IsPalindrome {
    public static void main(String[] args) {
        int number = 123322;

        System.out.println(palindrome(number));

    }

    static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n ,digits);
    }
    private static int helper(int n , int digits) {
        if (n % 10 == 0) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10 ,digits - 1)) + helper(n / 10, digits-1);
    }

    static boolean palindrome(int n) {
        return n == reverse(n);
    }
}
