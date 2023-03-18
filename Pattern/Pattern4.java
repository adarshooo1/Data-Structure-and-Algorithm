package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        Ptrn4(6);
    }

    static void Ptrn4(int n) { // defines a method named Ptrn4 that takes an integer parameter n
        for (int row = 1; row <= n; row++) { // iterates over the rows from 1 to n (inclusive)
            for (int col = 1; col <= row; col++) { // iterates over the columns from 1 to the current row (inclusive)
                System.out.print(col + " "); // prints the current column number followed by a space
            }
            System.out.println(); // prints a newline character to move to the next row
        }
    }
}
//Output:-
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
