//Leetcode Question 268. Missing Number
package Array.Sorting.InsertionSort;

public class LeetCodeQuestion1 {
    public static void main(String[] args) {
        int[] input = {0,1};
        int answer = findMissing(input);
        System.out.println(answer);
    }
    static int findMissing(int[] arr){
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr,i , correctIndex);
            } else {
                i++;
            }
        }
//            Case 1;
//            Search for the missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
//       Case 2
//       If everything is sorted then it will return the array length.
        return arr.length;
        }
    static void swap(int[] arr , int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
