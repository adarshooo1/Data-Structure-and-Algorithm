package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        Ptrn1(5);

    }
    static void Ptrn1(int n) { // defines a method named Ptrn1 that takes an integer parameter n
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col <= row; col++) { // iterates over the columns from 1 to the current row (inclusive)
                System.out.print("* "); // prints an asterisk followed by a space
            }
            System.out.println(); // prints a newline character to move to the next row
        }
    }
}
//  Output:-
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
