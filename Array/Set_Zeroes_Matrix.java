package Array;

import java.util.Arrays;

public class Set_Zeroes_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };

        System.out.println("Original Matrix");
        printMatrix(arr);

        setZeroes(arr);

        System.out.println("\nMatrix after setting zeros:");
        printMatrix(arr);


        int[][] arr2 = {
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };

        setZeroesOptimal(arr2);

        for (int[] rows : arr2) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create duplicate arrays to track zero positions
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Iterate through the original matrix and update duplicate arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Update the original matrix based on duplicate arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


    static void setZeroesOptimal(int[][] matrix) {
        boolean firstRowZero = false, firstColZero = false;

    // Mark First Row and Col to 0 and save for later;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstRowZero = true;
                    if (j == 0) firstColZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

    //Replace Inner Matrix with the help of the makers we set on the first row and first col of matrix
    //Suppose we have a matrix of 4 x 4, So outer part of the matrix will be used as a checkpoint and remaining 3 X 3,
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //Now we replace all item in the outer col to 0;
        if (firstRowZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        //Now we replace all item in the outer row to 0;
        if (firstColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}

