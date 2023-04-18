package Array.Sorting.MergeSort;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 2, 1,};
        mergeSortInPlace(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix =new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start + 0, mix.length);

    }
}
