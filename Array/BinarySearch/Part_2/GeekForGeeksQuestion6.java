//Geek For Geeks Question:- Find position of an element in a sorted array of infinite numbers.
package Array.BinarySearch.Part_2;

public class GeekForGeeksQuestion6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 28, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70};
        int check = RangeCheck(arr, 10);
        System.out.println(check);

    }

    static int RangeCheck(int[] arr, int target) {
        int start = 0;
        int end = 1;
//  A
        while (arr[end] < target) {
            //Here we are creating a new variable named newStart which will help to store the value of (end +1) variable value. Like in temp case that we are using for swapping.
            int newStart = end + 1;
            end = end + (end-start+1) * 2;
            start = newStart;//Here we assign new start index for searching.
        }
//        If below condition will not satisfy then this condition will run, which is a Binary search approach.
        return binarySearch(arr, target, start, end);
    }
    //  As this is an infinite array, we don't know about that its start and end index.
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }
}
