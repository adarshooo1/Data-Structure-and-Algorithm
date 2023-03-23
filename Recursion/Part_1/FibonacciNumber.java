package Recursion.Part_1;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(find_Fibonacci(8));

    }
    static int find_Fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n < 2) {
            return n;
        }
        // Recursive case: call the function for n-1 and n-2 and add the results
        return find_Fibonacci(n - 1) + find_Fibonacci(n - 2);
    }
}
