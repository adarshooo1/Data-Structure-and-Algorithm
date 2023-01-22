package Array.BinarySearch.Part_1;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {-12,-1,12,13,14,15,16,17,18,19,20,21,22};
        int check = BinarySearch(arr, 23);
        System.out.println(check);


    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;//Here start is from 0 index.
        int end = arr.length-1; //Here the end index is array length -1;
        if (arr.length == 0) {
            return -1; //Edge Case: If the array size is 0 then print -1;
        }
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
}
//Here we know that the order of the array is in ascending order
//But what when we don't know the order of the array? Go to class OrderAgnosticBS.
