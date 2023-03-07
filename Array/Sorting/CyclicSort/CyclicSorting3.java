package Array.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class CyclicSorting3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 1, 5, 9, 8};
        int answer = findDuplicate(arr);
        System.out.println(answer);

    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                // Calculate the correct index for the current element
                int correct = arr[i] - 1;

                // If the current element is not in its correct position, swap it
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
                else{
                    return arr[i];
                }
                // If the current element is already in its correct position, move to the next element
            }else {
                i++;
            }
        }
        return -1;
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

