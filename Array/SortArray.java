// In this array there are only 3 elements can be repeated and unordered we have to sort them.
//Ex: [0,1,1,1,2,1,0,0,2,0,2] => [0,0,0,0,1,1,1,1,2,2,2]
//Fist Place 0, then 1 and at last 2. Array have only this numbers.
package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 2, 1, 0, 0, 2, 0, 2};
//        int[] ans = matchColors(arr);
//        System.out.println(Arrays.toString(ans));

        int[] ans2 = DutchFlag(arr);
        System.out.println(Arrays.toString(ans2));

    }

    /*
    0 => Red
    1 => Green
    2 => Blue
    */

    //    Brute Force Approach; Time Complexity is O(2N) || Space Complexity is 0(1)
    public static int[] matchColors(int[] arr) {
//    {0,0,0,1,1,0,0,0,2,2,1};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }

    //    Optimal Approach => Dutch National Flag Algorithm.
    //    Time Complexity is O(N) || Space Complexity is 0(1);
    public static int[] DutchFlag(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, end, mid);
                end--;
            }
        }
        return arr;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
