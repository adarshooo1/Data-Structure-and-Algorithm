package Recursion.Part_3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(findIndex(arr, 4, 0));//This will search from the index 0 but return the index
        System.out.println(findIndexLast(arr, 6, arr.length - 1));//This will search from the last index but return the index.
        System.out.println(find(arr, 4, 0));////This will search from the index 0 but return the boolean.

    }
    //Return Index
    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }
    //Return index but searching from the last
    static int findIndexLast(int[] arr, int target, int index) {

        if (index == - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, target, index -1);
        }
    }

    //Return Boolean
    static Boolean find(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        //Here if the first conditions is satisfied then it will not go further because first condition is not satisfied
        // that's why it goes further and in the or(||) operator both condition is checked and one condition must be true
        // if not then again search.
        return arr[index] == target || find(arr, target, index + 1);
    }
}

