package Array;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 4, 5, 5, 5, 6};
        //Using Set. Set is a collection of unique item, if item is duplicate then
        Set<Integer> newNums = uniqueElement(nums);
        System.out.println(newNums.size());

        //Using Arrays.
        int arr = uniqueElement2(nums);
        System.out.println(arr);

    }

    // Remote Duplicate Item using Sets collection in java.
    public static Set<Integer> uniqueElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        return set;
    }

    // Remove Duplicate in-place from sorted array and return the count of unique items in the array.
    public static int uniqueElement2(int[] arr) {

        //  If the size of array is 0;
        if (arr.length == 0) {
            return 0;
        }

        int uniqueItem = 1; //Set the count of starting from 1.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueItem] = arr[i];
                uniqueItem++;
            }
        }
        return uniqueItem;
    }
}


