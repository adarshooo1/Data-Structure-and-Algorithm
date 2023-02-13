package Array.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortQuestiion1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //It
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr) {
    boolean swapped;
    // This is the outer loop which will start from very first Index to the last Index.
        for (int i = 0; i < arr.length - 1; i++) {
        //Initially we will suppose the swap isn't required because its sorted (Lets Assume)
            swapped = false;
            //This is the inner loop which will run every time to the array to the array.length in which it will decrease the size of the array, when array arr[i] will increase
            for (int j = 1; j < arr.length - i ; j++) {
//              Here we will check the index and index++ item that which one is greater and smaller, and accordingly we will swap the item.
                if (arr[j - 1] > arr[j]) {
//                    Swap function()
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = temp;
//                  If the item will swap then it turns swapping to true and prevent the loop to break.
                    swapped = true;
                }
            }
//            If the supposing case is matched and no swap is occurred then default is false which will match this case and break the loop
            if (!swapped) {
                break;
            }
        }
    }
}
//Bubble Sort is also known is Sinking sort or, Exchanging sort or, In place sorting Algorithm.
