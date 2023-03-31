package Recursion.Part_3;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
// create an array and test the various search functions

// create an array
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 12, 2, 12};

// find the index of the first occurrence of the value 4 starting from index 0.
        System.out.println(findIndex(arr, 4, 0));

// find the index of the last occurrence of the value 6 starting from the last index of the array.
        System.out.println(findIndexLast(arr, 6, arr.length - 1));

// check if the value 4 exists in the array starting from index 0 and return boolean.
        System.out.println(find(arr, 4, 0));

// find all occurrences of the value 12 in the array and add their indices to the list.
        findAllIndex(arr, 12, 0);
        System.out.println(list);

// find all occurrences of the value 12 in the array and add their indices to the list using an auxiliary list parameter
        System.out.println(findAllIndex2(arr, 12, 0, new ArrayList<>()));

// find all occurrences of the value 12 in the array and return their indices in a list
        System.out.println(findAllIndex3(arr, 12, 0));
    }

    // recursive function to find the index of the first occurrence of target in the array
    static int findIndex(int[] arr, int target, int index) {
        // base case: if index is equal to the length of the array - 1 (i.e., the entire array has been searched), return -1
        if (index == arr.length - 1) {
            return -1;
        }
        // if the element at index is equal to target, return the index
        if (arr[index] == target) {
            return index;
        }
        // recursively call the function with the next index
        else {
            return findIndex(arr, target, index + 1);
        }
    }


    // recursive function to find the index of the last occurrence of target in the array
    static int findIndexLast(int[] arr, int target, int index) {
        // base case: if index is equal to -1 (i.e., the entire array has been searched), return -1
        if (index == -1) {
            return -1;
        }
        // if the element at index is equal to target, return the index
        if (arr[index] == target) {
            return index;
        }
        // recursively call the function with the previous index
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }


    // Returns true if the target element is present in the input array
    // Returns false otherwise
    static Boolean find(int[] arr, int target, int index) {

        // If we have searched the entire array and still haven't found the target element
        // then return false
        if (index == arr.length - 1) {
            return false;
        }

        // If the current element is equal to the target element, return true
        if (arr[index] == target) {
            return true;
        }
        // Otherwise, continue searching in the rest of the array by recursively calling the function
        // with an incremented index value.
        else {
            return find(arr, target, index + 1);
        }
    }


    // create a static ArrayList to store the indices where target appears in the array
    static ArrayList<Integer> list = new ArrayList<>();
    // recursive function to find all occurrences of target in the array
    static void findAllIndex(int[] arr , int target, int index) {
        // base case: if index is equal to the length of the array, return
        if (index == arr.length) {
            return;
        }
        // if the element at index is equal to target, add the index to the list
        if (arr[index] == target) {
            list.add(index);
        }
        // recursively call the function with the next index
        findAllIndex(arr, target, index + 1);
    }


    //Here we are returning the Arraylist as passing list in the argument and the function return type is ArrayList.
    static ArrayList findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            //If we are at the end of the array and there is no other element after this then return all the element in the list, that we have.
            return list;
        }
        if (arr[index] == target) {
            //If the array at the index is equal to the target element. then add the index in the list.
            list.add(index);
        }
        //Recursive function which will search, transverse , add the element in the array and when the work is done the return the list.
        return findAllIndex2(arr, target, index + 1,list);
    }


    //Here we are returning the arraylist but not in the argument like previous.
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        // if index is equal to the length of the array, return an empty list
        if (index == arr.length) {
            return list;
        }
        // if the element at index is equal to target, add the index to the list
        if (arr[index] == target) {
            list.add(index);
        }
        // recursively call the function with the next index
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);
        // add the results of the recursive calls to the list
        list.addAll(ansFromBelowCalls);
        // return the list of indices where target appears in the array
        return list;
    }
}