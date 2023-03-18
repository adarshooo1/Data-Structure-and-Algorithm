package Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        Ptrn3(5);
    }

    static void Ptrn3(int n) { // defines a method named Ptrn3 that takes an integer parameter n
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col <= n - row + 1; col++) { // iterates over the columns from 1 to n minus the current row number plus 1
                System.out.print(" *"); // prints a space followed by an asterisk
            }
            System.out.println(); // prints a newline character to move to the next row
        }
    }
}
//Output:-
//         * * * * *
//         * * * *
//         * * *
//         * *
//         *

