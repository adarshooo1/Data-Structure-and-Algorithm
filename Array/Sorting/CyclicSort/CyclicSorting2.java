package Array.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class CyclicSorting2 {

    public static void main(String[] args) {
        // Define the array to be sorted
        int[] arr = {2, 4, 5, 6, 4, 3, 2, 7};

        // Call the cyclicSort function to sort the array and find missing numbers
        List<Integer> ans = cyclicSort(arr);

        // Print the missing numbers
        System.out.println(ans);
    }

    // Function to sort the array using cyclic sort and find missing numbers
    static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Calculate the correct index for the current element
            int correct = arr[i] - 1;

            // If the current element is not in its correct position, swap it
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            // If the current element is already in its correct position, move to the next element
            else {
                i++;
            }
        }

        // After sorting the array, find all missing numbers and add them to a list
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(index + 1);
            }
        }

        // Return the list of missing numbers
        return list;
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
