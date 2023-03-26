package Recursion.Part_2;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
         return n * factorial(n - 1);
    }
}
