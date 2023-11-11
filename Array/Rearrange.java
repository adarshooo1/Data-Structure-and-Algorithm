package Array;

import java.util.ArrayList;
import java.util.Arrays;

//Rearrange elements by positive and negative Ex: {1,-2,-3,4,-5,6,} => {1,-2,4,-3,6,-7,}, One positive then one negative.
public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, -5, 6,};
//        int[] ans = Brute(arr);
//        System.out.println(Arrays.toString(ans));

        int[] ans = Optimal(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] Brute(int[] arr) {
        ArrayList<Integer> positiveArr = new ArrayList<>();
        ArrayList<Integer> negativeArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveArr.add(arr[i]);
            } else {
                negativeArr.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = positiveArr.get(i);
            arr[2 * i + 1] = negativeArr.get(i);
        }
        return arr;
    }


    static int[] Optimal(int[] arr) {
        int[] rearrange = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) { //Which means positive
                rearrange[posIndex] = arr[i];
                posIndex = posIndex + 2;

            } else { //Else negative
                rearrange[negIndex] = arr[i];
                negIndex = negIndex + 2;
            }
        }

        arr = rearrange;
        return arr;
    }
}
