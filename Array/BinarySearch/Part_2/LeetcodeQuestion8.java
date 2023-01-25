//Leetcode Question 33.Search in Rotated Sorted array
package Array.BinarySearch.Part_2;

import javax.swing.plaf.basic.BasicArrowButton;
import java.time.Period;
import java.util.Random;

public class LeetcodeQuestion8 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 15, 0, 1, 2, 3, 4, 5, 6};
        int check = RotatedArray(arr, 9);
        System.out.println(check);

    }

    static int RotatedArray(int[] arr, int target) {
        int Pivot = findPivot(arr);
        if (Pivot == -1) {
            BinarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[Pivot] == target) {
            return Pivot;
        }
        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0, Pivot);
        }else{
            return BinarySearch(arr, target, Pivot + 1, arr.length - 1);
        }
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {//With the Help of indexing here we are performing the steps and if the index overlap or cross each other than break the loop and loop exit which means target not in the index;
            int mid = start + (end - start) / 2;//Sometimes it may be possible that sum of that variable might exceed the Integer limit.So that's why we use this.
            if (target < arr[mid]) { //For ascending sorted arrays only
                end = mid - 1; //As we know the element is not in the middle index then end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;//Same approach
            } else return mid; //this will return the index of that number;
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
//      This will return the pivot of an array. Pivot is the point in sorted array where after the pivot elements are arranged in ascending order and at the point of index 0 till pivot was also an ascending sorted array. Ex:- {12,13,14,15,0,1,2,3,4,5}
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
