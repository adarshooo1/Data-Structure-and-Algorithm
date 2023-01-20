package Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6,7,8};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxval = arr[0];
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
