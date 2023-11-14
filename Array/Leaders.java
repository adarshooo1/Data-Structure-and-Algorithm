package Array;
//Leaders Problem, In this question we just simply have to print or return the Leaders;
// Ex: [12, 5, 10, 11, 8, 9, 2] -> 12,11,9,2 as we can see there is no greater number in the right direction of array after them.

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {18, 5, 9, 6, 11, 10, 7};
        Brute(arr);

        int[] arr2 = {18, 5, 9, 6, 11, 10, 7};
        int[] answerArray = Optimal(arr2);
        System.out.println(Arrays.toString(answerArray));
    }

    static void Brute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    static int[] Optimal(int[] arr) {

        int count = 0;
        int max = Integer.MIN_VALUE;

        // Check for max, increase count with each max item in the array;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];

                // With this count we can easily determine the size of the array which has all the leader number in array.
                count++;
            }
        }

        // It will help in indexing in AllLeaderArray
        int index = 0;
        int Max2 = Integer.MIN_VALUE;

        // Leader array which is initialized by the count, which is determined via max items in the array.
        int[] AllLeaderArray = new int[count];

        // NOTE: Just looping for putting elements otherwise simply can use arraylist and add Leaders in the list.
        // Again iterate in the array,and fill the leader array with the max
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > Max2) {
                Max2 = arr[i];
                AllLeaderArray[index] = arr[i];
                index++;
            }
        }

        //Time complexity in order to do this is O(2N) which is basically O(N);
        //Space complexity is 0(N),because using ArrayList or Array is just a way to store leader, Where is the size of the array;
        return AllLeaderArray;
    }
}
