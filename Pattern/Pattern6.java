package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        Ptrn6(5);

    }

    static void Ptrn6(int n) {
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col <= row; col++) { // iterates over the columns from 1 to the current row (inclusive)
                System.out.print("* "); // prints an asterisk followed by a space
            }
            System.out.println(); // prints a newline character to move to the next row
        }
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col < n - row + 1; col++) { // iterates over the columns from 1 to n minus the current row number plus 1
                System.out.print("* "); // prints asterisk followed by the spaces between them.
            }
            System.out.println(); // prints a newline character to move to the next row
        }
    }
}
//Output:-
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


