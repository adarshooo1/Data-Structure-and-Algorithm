package Array.BinarySearch.Part_3;

import java.util.Arrays;

public class Searching_in_Matrices {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 10},
                {12, 14, 16, 18},
                {25, 27, 35, 40},
                {45, 49, 50, 55}
        };
//        Array Visualisation:
//              index =        0   1    2    3
//        int[] []arr =   0  { 1 , 12 , 25 , 45 } ----> Row
//                        1  { 3 , 14 , 27 , 49 }
//                        2 { 5 , 16 , 35 , 50 }
//                        3  {10 , 18 , 40 , 55 }
//                             |
//                             |
//                            col
//                             Matrix of (3 X 3)

//                while (row < Matrices.length && col >= 0) {Run loop till when it gets reduced (arr.length-1 : 3) So (3 > 0) wait till changes into 0.
//            if (target == Matrices[row][col]) {
//                return new int[]{row, col};
//            } else if (target > Matrices[row][col]) {
//                row++;
//            }else{
//                col--; // When element at the top-most index is the upper bound for the Element to exceed and element is Below that number So, it will decrease the size of column in the array.
//            }

//        Row is rightward moving in Direction
//        Col is downward moving in Direction.
//        Here we are checking the topmost element in the array
//        Lets do this with an Example:
//        Think that we want are trying to find 50 in this array
//        So a check if(Target > arr[row][col]) As we know [col = arr.length-1] So, When loop run then it will search at that index what is the number present in that index :- 10 at first loop when run //So it skips 0th row,
//        so 50 is greater than 10 so, row++ [1][arr.length -1(col:3)]: So the element which is present at that index is 18 //It skips row 1st
//        so 50 is greater than 18 so, row++ [2][arr.length -1(col:3)]: SO the element which is present at that index is 40 //It skips row 2nd
//        so 50 is greater than 55, No... So col-- [3][arr.length -1(col:2)] Here col is reduced by size 1 So,Run ran once in find of the target element ran loop one more time.
//        so 50 is greater than less than 0r equal to 50. Answer is Equal to the element present at that index, so return the Index [3][2]
//        Answer is :[3][2] at this index element present is 50. Answer found.


        int[] Answer = SearchIn2D(arr, 27);
        System.out.println(Arrays.toString(Answer));
    }

    static int[] SearchIn2D(int[][] Matrices, int target) {
        int row = 0;
        int col = Matrices.length - 1;

        while (row < Matrices.length && col >= 0) {
            if (target == Matrices[row][col]) {
                return new int[]{row, col};
            } else if (target > Matrices[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1}; //If Target element not found in the Matrices.
    }
}

