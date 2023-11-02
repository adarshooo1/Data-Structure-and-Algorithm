package Array;

public class Max_SubArrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int ans = longest_subArray(arr, 7);
        System.out.println(ans);

    }

    // Brute Force Approach.
    public static int longest_subArray(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { //0(n)
            int sum = 0;
            for (int j = i; j < arr.length; j++) { //O(n)
                sum += arr[j];

                if (sum == num) {
                    count = Math.max(count, j - i + 1);
                }
            }
            // Total time complexity is around O(n^2);
        }
        return count;
    }

    // Optimal Approach;
    public static int longest_subArray2(int[] arr, int targetSum) {
        int maxLength = 0;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            while (currentSum > targetSum) {
                currentSum += arr[left];
                left++;
            }

            if (currentSum == targetSum) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength;
    }
}