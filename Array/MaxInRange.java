package Array;

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 444, 3, 4321};
        System.out.println(maxInRange(arr,0 , 5));
    }

    static int maxInRange(int[] arr, int start, int end) {
        int Max = arr[start];

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < end; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }
}
