package Array.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//  This is the Insertion Sorting algorithm which will work all kind of number in the array.
//  Worst time complexity is O(n * n);
//  Best time complexity is O(n)

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
//          Here j always should be greater than i + 1; and till if the j != 0 ; check all the item inside the array.
            for (int j = i + 1; j != 0; j--) {
                if (arr[j] < arr[j - 1]) {
//                  Make compare then swap with the previous element in the array and maintain the order of being sorted.
                    swap(arr,j , j-1);
                }else{
                    break;
                }
            }
        }
    }
//  Swapping function for exchanging the element inside the array;
    static void swap(int[] arr , int num1 , int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
