package Array.BinarySearch.Part_1;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int check = orderAgnosticBS(arr, 4);
        System.out.println(check);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            //If array length is 0.
            return -1;
        }
        boolean isAsc = arr[start] < arr[end];//Creating a check if this condition satisfies then perform this step else some other step.
        while (start <= end) {//This check is mandatory. Because it will help index to compare and iterate over the whole array.
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;//This is common for both of the conditions.
            }
            if(isAsc){//If condition match perform this step.
                if (arr[mid] < target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            else{//If conditions not match perform this step.
                if (arr[mid] > target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }
        //If element is not present in the array.
        return -1;
    }
}
