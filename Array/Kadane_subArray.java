package Array;

//In this problem we have to return the max sum in a contiguous sub-array Ex:[-2, -3, 4, -2, 2, 5, -3].
// So which part of sub-array has maximum sum so that we can return the max sum or the part of array.

import java.util.Arrays;

public class Kadane_subArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -2, -2, 2, 5, -3};
        int ans = Brute(arr);
        System.out.println(ans);

        int[] arr2 = {-2, -3, 4, -2, 2, 5, -3};
        int ans2 = Better(arr2);
        System.out.println(ans2);

        int[] arr3 = {-2, -3, 4, -2, 2, 5, -3};
        int ans3 = Optimal(arr3);
        System.out.println(ans3);
    }


    static int Brute(int[] arr) {
//      If the array has length 0;
        if (arr.length == 0) {
            return -1;
        }

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;

//  This will iterate start from the ith Index and go till j's count in the array and try to update the max with every iteration;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    Max = Math.max(sum, Max);
                }
            }
        }
//      In case we do not find anything in the array then return -1;
        return Max;
    }

    static int Better(int[] arr) {
//      If the array has length 0;
        if (arr.length == 0) {
            return -1;
        }

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                Max = Math.max(sum, Max);
            }
        }
//      In case we do not find anything in the array then return -1;
        return Max;
    }


    static int Optimal(int arr[]) {
        int Max = Integer.MIN_VALUE;

//      In Order to print the Su-array has maximum sum;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;


        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (Sum == 0) {
                start = i;
            }

            Sum += arr[i];

            if (Sum > Max) {
                Max = Sum;

                ansStart = start;
                ansEnd = i;
            }

            if (Sum < 0) {
                Sum = 0;
            }

/*  //In case if questions need is, If the max value less than 0 Ex:-1, then return 0;;
            if (Max < 0) {
            Max = 0;
            }*/
        }

        //printing the sub-array:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        return Max;
    }
}
