package Array;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2}; //combinations: 1,2,3 || 1,3,2 || 2,1,3 || 2,3,1 || 3,1,2 || 3,2,1
        Optimal(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Optimal(int[] arr) {
        int breakPoint = -1; //Let's assume that the breakPoint number is -1 initially and
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint == -1) {
            reverse(arr, 0, arr.length - 1);
        }

        for (int i = arr.length - 1; i > breakPoint; i--) {
            if (arr[i] > arr[breakPoint]) {
                swap(arr, i, breakPoint);
                break;
            }
        }

        reverse(arr, breakPoint + 1, arr.length - 1);
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    //  Reverse the whole array, If the array has now break point;
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
