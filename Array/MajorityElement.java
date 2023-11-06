package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 4, 4, 3, 5};
        int ans = Major(arr);
        System.out.println(ans);

        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        int ans2 = HashSolution(arr2);
        System.out.println("The majority element is: " + ans2);

        int[] arr3 = {2, 2, 1, 1, 1, 1, 1, 8};
        int ans3 = MajorElement(arr3);
        System.out.println("The majority element is: " + ans3);


    }

    // Brute Force Approach O(N^2)
    public static int Major(int[] arr) {
        int repeatedNumber = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > (arr.length / 2)) {
                    maxCount = count;
                    repeatedNumber = arr[i];
                }
            }
        }
        System.out.println("Repeated Number is:- " + repeatedNumber + ", Appearing more then the array.length/2 times in the complete array.");
        System.out.print("Max count is: ");
        return maxCount;
    }


    public static int HashSolution(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

//        Sorting the element with its occurrence;
        for (int i = 0; i < arr.length; i++) {
            int ans = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], ans + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }


    public static int MajorElement(int[] arr) {
        //  Approach will be like when we have a count and Element variable, count starting form 1 and loop will go
        //  on with the complete array checking each and every element. and add and cancel out in pairs.
        int element = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
//                If i = 0, then where the index is located update the value of element with that index.
                element = arr[i];
            } else if (element == arr[i]) count++;
//            If item is different then the element then the --count by 1;
            else count--;
        }

        int ctx = 0;
        for (int i = 0; i < arr.length; i++) {
//          Check and update the value of ctx.
            if (arr[i] == element) ctx++;
        }
//        Took the count stored as ctx, then check the ctx is greater than the half of the array or not, If it's more
//        than the half of the length of the array only then we have to return the array.
        if (ctx > (arr.length / 2)) return element;

//        If not found return -1;
        return -1;
    }
}
