package Recursion.Part_1;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        Print(1);
    }
    static void Print(int n) {
        System.out.println(n);

        //With the help of this check are able to control the function, and work till where we want to print.
        if (n == 5) {
            return;
        }
        //Here we do the same with the help of recursion,As we know that function is calling itself as a function is called recursion.
        Print(n + 1);
    }
}
