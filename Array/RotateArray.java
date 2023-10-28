package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        int[] ans = rotateByOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    //Left Rotate an Array by One.
    public static int[] rotateByOne(int[] arr) {//Depends Upon the requirement what we have to return, here I have to return an array which is rotated by 1 place;
        int temp = arr[0]; //Store the item at 0 index in a temp variable.
        for (int i = 1; i < arr.length; i++) { //Just loop from 1st index.
            arr[i - 1] = arr[i]; // i at index 1; and i - 1 is at 0 index so store the 1st index item to index -1 place.
        }
        arr[arr.length - 1] = temp; //After the iteration is over, place the temp item at the last index of the array.
        return arr; //Return the array.
    }
}

