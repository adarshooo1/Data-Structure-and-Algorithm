package Recursion.Part_2;

public class ReverseNumber {
    public static void main(String[] args) {
        //Way 1;
        reverse1(1234);
        System.out.println(sum);

        //Way 2;
        System.out.println(reverse2(988));

    }
    //Way 1.
    static int sum = 0;
    static void reverse1(int n) {

        if (n == 0) {
            return;
        }

        int rem = n % 10; //This will give the remainder,
        sum = sum * 10 + rem; //This will add the remainder one by one and help in to make the reverse the number.
        reverse1(n/10);
    }

    //Way 2.
    static int reverse2(int n) {
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
}
