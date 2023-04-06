package Recursion.Part_4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr , int row , int col , int max){
        if (row == 0) {
            return;
        }
        if (row > col) {

            //check if the array at the current index is greater than swap.
            if (arr[col] > arr[max]) {
                selectionSort(arr, row, col + 1, col);
            }else{
                selectionSort(arr , row , col + 1 , max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            selectionSort(arr , row - 1 , 0 , 0);
        }
    }
}
