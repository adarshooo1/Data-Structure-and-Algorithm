package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        Ptrn5(5);

    }
    static void Ptrn5(int n) { // defines a method named Ptrn3 that takes an integer parameter n
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col <= n - row + 1; col++) { // iterates over the columns from 1 to n minus the current row number plus 1
                System.out.print(n - col + 1 + " "); // prints a space followed by values decrement
            }
            System.out.println(); // prints a newline character to move to the next row
        }
    }
}
//Output:-
//        5 4 3 2 1
//        5 4 3 2
//        5 4 3
//        5 4
//        5

