package Array.LinearSearch;

public class Search_In_Range {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 4, 15, 6, 7, 821, 43, 432, 43, 45, 454};
        int search = SearchInRange(arr, 432, 8, 12);
        System.out.println(search); //Output :- Index 9
    }

    static int SearchInRange(int[] arr,int target,int start,int end) {//Start will give the index from th loop will start ad till index end loop will run;
        if (arr.length == 0) {
            return -1;//If array size is 0.
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;//If Number not found in range
    }

}
