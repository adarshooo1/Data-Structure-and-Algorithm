package Array;

public class LargestNum {
    public static void main(String[] args) {
//  Find the maximum in the array in any.
        int[] nums = {1, 3, 5, 18, 3, 1, 12, 21};
        int ans = largeNum(nums, nums.length);
        System.out.println(ans);

//  Find the second max in the array
        //  Way 1: In a sorted array.
        int[] num2 = {7, 8, 8, 8, 8, 8, 8};
        int ans2 = secondLargestNum(num2, num2.length);
        System.out.println(ans2);

        //  Way 2: In un-sorted array.
        int[] num3 = {7, 7, 8, 79, 90, 99, 89, 76, 45};
        int ans3 = secondLargestNum2(num3, num3.length);
        System.out.println(ans3);

        //  Way 3: In un-sorted array.
        int[] num4 = {7, 7, 8, 79, 90, 99, 89, 76, 45};
        int ans4 = secondLargestNum3(num4, num4.length);
        System.out.println(ans4);


    }


    //  Question 1: Largest element in the array;
    public static int largeNum(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //  Question 2: Find second-largest element in the array
    //  Way 1; Finding 2nd largest biggest number in the sorted array.
    public static int secondLargestNum(int[] arr, int n) {
        int firstLargest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != firstLargest && arr[i] < firstLargest) {
                firstLargest = arr[i];
                break;
            }
        }
        return firstLargest;
    }

    //  Way 2; Finding 2nd largest biggest number in the un-sorted array,
    public static int secondLargestNum2(int[] arr, int n) {
        int firstMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (firstMax < arr[i]) {
                firstMax = arr[i];
            }
        }
        int secondMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (secondMax < arr[i] && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    //  Way 3; Finding 2nd largest biggest number in the un-sorted array,
    public static int secondLargestNum3(int[] arr, int arrLength) {
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arrLength; i++) {
            if (firstLargest < arr[i]) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

