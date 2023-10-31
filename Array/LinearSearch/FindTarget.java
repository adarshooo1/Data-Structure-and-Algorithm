package Array.LinearSearch;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 3, 1, 0, 5};
        int ans = findIndex(arr, 3);
        System.out.println(ans);

    }

    public static int findIndex(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;// In case if not found.
    }
}
