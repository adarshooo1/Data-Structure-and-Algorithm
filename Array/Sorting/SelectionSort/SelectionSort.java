package Array.Sorting.SelectionSort;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 1, 1, 6, 6, 7};
        selectionAndSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionAndSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
//          This will find the max index in the range because we don't want to make comparison in that part which we have already and place it to its correct index and also work with the duplicate number as well
            int maxIndex = getMaxIndex(arr, 0, last);
//          This will help in to swap the element form the element at arr[i] with the max;
            swap(arr , maxIndex , last);
        }
    }

//  This will help to get Maximum number in the array.
    static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    //  This will help in to swap the element
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
