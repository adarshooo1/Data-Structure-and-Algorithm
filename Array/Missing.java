package Array;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int ans = findMissing(arr);
        System.out.println(ans);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 9};
        int ans2 = findMissing2(arr2, 9);
        System.out.println(ans2);

        int[] arr3 = {1, 2, 3, 4, 5, 6, 8, 9};
        int ans3 = findMissing3(arr3);
        System.out.println(ans3);


    }

    //    If arr starting from any number;
    public static int findMissing(int[] arr) {
        int series = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == series) {
                series++;
            } else {
                return series;
            }
        }
        return series;
    }

    //    If number always be start from natural number;
    public static int findMissing2(int[] arr, int n) {
        int TotalArraySum = n * (n + 1) / 2;
        int ActualArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            ActualArraySum += arr[i];
        }
        return TotalArraySum - ActualArraySum;
    }

//    Find missing with xor;

    public static int findMissing3(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ arr.length;
        return (xor1 ^ xor2);
    }
}
