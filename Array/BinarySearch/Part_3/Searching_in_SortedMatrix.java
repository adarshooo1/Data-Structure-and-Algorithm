package Array.BinarySearch.Part_3;

import java.util.Arrays;

public class Searching_in_SortedMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
        };
        int[] Answer = SortedArray(nums , 11);
        System.out.println(Arrays.toString(Answer));
    }

    //Search in the row provided between the column provided;
    static int[] BinarySearch(int[][] Matrix, int row, int cStart, int cEnd, int Target) {
        while (cStart < cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (Target == Matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if (Target > Matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] SortedArray(int[][] arr, int Target) {
        int rows = arr.length;
        int cols = arr[0].length; //If the matrix is empty;
        if (rows == 1) {
            return BinarySearch(arr, 0, 0, cols - 1, Target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

//      Run the loop till 2 rows remaining and apply Binary Search in the Spited Array.
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (Target == arr[mid][cMid]) {
                return new int[]{mid, cMid};
            }
            if (Target > arr[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
//        Now we have two rows
//        Check whether the target is in the col of 2 rows

        //When Array get split then it might be possible then apply the check in both of the row -> column.

//      //If mid at 1st rows -> Column
        if (arr[rStart][cMid] == Target) {
            return new int[]{rStart, cMid};
        }
        //If mid at 2nd rows -> Column
        if (arr[rStart + 1][cMid] == Target) {
            return new int[]{rStart + 1, cMid};

        }
//      After 2 rows -> column 2D arrays is separated into 4 sub parts other than mid.

        //Search in 1st half
        if (Target <= arr[rStart][cMid - 1]) {
            return BinarySearch(arr, rStart, 0, cMid - 1, Target);
        }
        //Search in 2nd half
        if (Target >= arr[rStart][cMid + 1] && Target < arr[rStart][cols - 1]) {
            return BinarySearch(arr, rStart, cMid + 1, cols - 1, Target);
        }
        //Search in 3rd half
        if (Target <= arr[rStart + 1][cMid - 1]) {
           return BinarySearch(arr, rStart + 1, 0, cMid - 1, Target);
        }
        //Search in 4th half
        else{
           return BinarySearch(arr, rStart + 1, cMid + 1, cols - 1, Target);
        }
    }
}



