package Array.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
//        index      0  1  2  3  4  5
        int[] arr = {4, 3, 5, 6, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    //    When given number from range 1 to N => use cyclic sort , or called an infinite array
    static void cyclicSort(int[] arr) {
        int i = 0;
         while (i < arr.length) {
             int correctIndex = arr[i] - 1;
             if (arr[i] != arr[correctIndex]) {
                 swap(arr, correctIndex, i);
             }
             else{
                 i++;
             }
         }
    }

    static void swap(int[] arr , int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
