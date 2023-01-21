package Array.LinearSearch;

public class Search_In_Array {
    public static void main(String[] args) {
        int[] arr = {19, 343, 232, 15, 50, 245};
        int search = linearSearch(arr, 15);
        System.out.println(search);
        int search2 = linearSearch2(arr, 222);
        System.out.println(search2);
        boolean search3 = linearSearch3(arr, 8);
        System.out.println(search3);
    }

//  It will return the target element in the array.
    static int linearSearch2(int[] arr, int target) {
//        If array length is 0
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // As well as we can also return Integer.MIN_VALUE.

        }
//        This will return the number in the array with the help of enhanced for-each-loop.
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
//        This will return -1 if number not found in the array
        return Integer.MAX_VALUE; // As well as we can also return Integer.MAX_VALUE.


    }
//  It will return the Index of the target element.
    static int linearSearch(int[] arr, int target) {
        //If size of the array is null or empty
        if (arr == null) {
            return -1;
        }
        //Iterating through th loop in the search of target;
        for (int i = 0; i < arr.length; i++) {
            //Condition if number find or match the criteria print output
            if (arr[i] == target) {
                return i;
            }
        //Iterating through the Enhanced for loop and print the element;

        }
        //If number not find in the array print -1;
        return -1;
    }

    //  It will return boolean Expression.(True is number present./ Else False)
    static boolean linearSearch3(int[] arr, int target) {
        //        If array length is 0
        if (arr.length == 0) {
            return false;
        }
//        This will return the number in the array with the help of enhanced for-each-loop.
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
//        This will return -1 if number not found in the array
        return false;
    }
//Best Time Complexity is O(1) which means the number we are searching is at the 1st index in the array.
//Worst Time Complexity is O(n) which means the number we are searching is at the last index or not present in the array.
//    Here (n) stands for size of the array.

}
