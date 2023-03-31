package Recursion.Part_3;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBS(arr, 2, 0, arr.length - 1)); // prints 6
    }

    static int rotatedBS(int[] arr, int target, int start, int end) {
        // if start index is greater than end index, target is not found in the array
        if (start > end) {
            return -1;
        }
        // calculate the middle index
        int mid = start + (end - start) / 2;
        // if the middle element is the target, return its index
        if (arr[mid] == target) {
            return mid;
        }
        // check if the left half of the array is sorted and target lies within that range
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                // recurse on the left half of the array
                return rotatedBS(arr, target, start, mid - 1);
            }else{
                // recurse on the right half of the array
                return rotatedBS(arr, target, mid + 1, end);
            }
        }
        // if the left half is not sorted, the right half must be sorted
        if (target >= arr[mid] && target <= arr[end]) {
            // recurse on the right half of the array
            return rotatedBS(arr, target, mid + 1, end);
        }
        // otherwise, recurse on the left half of the array
        return rotatedBS(arr, target, start, mid - 1);
    }
}
