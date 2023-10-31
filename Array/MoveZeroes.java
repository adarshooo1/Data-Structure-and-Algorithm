package Array;

import java.util.Arrays;

//Move all zeroes to right corner;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1};

//        Way 1:
        MoveZero(arr);
        System.out.println(Arrays.toString(arr));

//        Way 2
        ZeroesToRight(arr);
    }

    //    Way 1:
    public static void MoveZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {  //Condition will only true when the current index is not equal to zero otherwise skip the below and go back to loop.
                int temp = arr[count]; //As we are storing arr[count] in a temporary Variable; Zero = 0; So it will point to the 0 index;
                arr[count] = arr[i]; //Now we are setting the value of arr[count] = arr[i], which is 8 = 8;
                arr[i] = temp; //Index2 will have the value of temporary variable.
                count++; //This will only increase when the condition is satisfied then it will change the count of the count variable.
            }
        }
    }

    //    Way 2:
    public static void ZeroesToRight(int[] arr) {
        int countOfZero = 0;
        int[] tempArray = new int[arr.length];
        if (arr.length == 0) {
            System.out.println("-1");
        }

        // Copy non-zero elements to the tempArray
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                tempArray[countOfZero] = arr[i];
                countOfZero++;
            }
        }
        arr = tempArray;
        System.out.println(Arrays.toString(arr));
    }
}
