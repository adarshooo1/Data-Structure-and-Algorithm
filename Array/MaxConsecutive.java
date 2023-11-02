package Array;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 0, 0};
        int ans = findConsecutiveCount(arr, 1);
        System.out.println(ans);

    }

    public static int findConsecutiveCount(int[] arr, int num) {
        int count = 0;
        int MaxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                MaxCount = Math.max(MaxCount, count);
            }
            else{
                count = 0;
            }
        }
        return MaxCount;
    }
}
