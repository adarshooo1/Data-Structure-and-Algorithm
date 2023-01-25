package Array.BinarySearch.Part_2;

public class LeetcodeQuestion9 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 15, 2, 2, 5, 7};
        int check = RotatedArray(arr, 5);
        System.out.println(check);

    }

    static int RotatedArray(int[] arr, int target) {
        int Pivot = findPivot(arr);
        if (Pivot == -1) {
            BinarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[Pivot] == target) {
            return Pivot;
        }
        if (target >= arr[0]) {
            return BinarySearch(arr, target, 0, Pivot);
        }else{
            return BinarySearch(arr, target, Pivot + 1, arr.length - 1);
        }
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {//With the Help of indexing here we are performing the steps and if the index overlap or cross each other than break the loop and loop exit which means target not in the index;
            int mid = start + (end - start) / 2;//Sometimes it may be possible that sum of that variable might exceed the Integer limit.So that's why we use this.
            if (target < arr[mid]) { //For ascending sorted arrays only
                end = mid - 1; //As we know the element is not in the middle index then end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;//Same approach
            } else return mid; //this will return the index of that number;
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
//      This will return the pivot of an array. Pivot is the point in sorted array where after the pivot elements are arranged in ascending order and at the point of index 0 till pivot was also an ascending sorted array. Ex:- {12,13,14,15,0,1,2,3,4,5}
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //This will skip the duplicate value.

                //Might be start and end is pivot so also check.

                //Check whether start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
               start++;

                //Check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //Left side is sorted, so pivot should be in right.
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
