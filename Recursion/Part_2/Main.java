package Recursion.Part_2;

public class Main {
    public static void main(String[] args) {
    fun(5);
    }
    static void fun(int n){
        System.out.println(n);
        if (n == 1 ) {
            return;
        }
        fun(n - 1);
    }
}
