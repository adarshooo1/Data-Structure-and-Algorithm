package Array;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 2, 4, 5};
        int[] arr2 = {4, 4, 4, 4, 4, 5, 6, 7};

//        Way 1:
        int[] newArray = union(arr1, arr2);
        System.out.println(Arrays.toString(newArray));

//        Way 2:
        ArrayList<Integer> Union = unionArray(arr1, arr2);
        System.out.print("[");
        for (int i : Union) {
            System.out.print(i + " ");
        }
        System.out.print("]");

//        Intersection:
        ArrayList<Integer> Intersect = Intersection(arr1, arr2);
        System.out.println(Intersect);
    }

    //    Way 1: Brute force solution;
    public static int[] union(int[] arr1, int[] arr2) {
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            unique.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            unique.add(arr2[j]);
        }

        int[] newArray = new int[unique.size()];
        int index = 0;

        for (int num : unique) {
            newArray[index] = num;
            index++;
        }
        return newArray;
    }

    //    Way 2: Optimal Solution;
    public static ArrayList<Integer> unionArray(int[] arr1, int[] arr2) {
        int pointer1 = 0;
        int pointer2 = 0;


        ArrayList<Integer> union = new ArrayList<>();
//        Till the both array has length
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] <= arr2[pointer2]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[pointer1]) {
                    union.add(arr1[pointer1]);
                }
                pointer1++;
            } else if (arr1[pointer1] >= arr2[pointer2]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[pointer2]) {
                    union.add(arr2[pointer2]);
                }
                pointer2++;
            }
        }

        while (pointer1 < arr1.length) {
            if (union.get(union.size() - 1) != arr1[pointer1]) {
                union.add(arr1[pointer1]);
            }
            pointer1++;
        }

        while (pointer2 < arr2.length) {
            if (union.get(union.size() - 1) != arr2[pointer2]) {
                union.add(arr2[pointer2]);
            }
            pointer2++;
        }
        return union;
    }

    // Find Intersection in both of the array.
    static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
        //What both have common in Array1 and Array2;
        int pointer1 = 0;
        int pointer2 = 0;

        ArrayList<Integer> Intersect = new ArrayList<>();
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] < arr2[pointer2]) {
                pointer1++;
            } else if (arr1[pointer1] > arr2[pointer2]) {
                pointer2++;
            } else {
                Intersect.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }
        return Intersect;
    }
}

