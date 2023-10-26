package Array;

public class LargestNum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 18, 3, 1, 12 , 21};
        int ans = largeNum(nums , nums.length);
        System.out.println(ans);

        int[] num2 = {7, 7, 8, 79, 90, 99, 89, 76, 45};
        int ans2 = secondLargestNum(num2 , num2.length);
        System.out.println(ans2);



    }


    //  Question 1: Largest element in the array;
    public static int largeNum(int[] arr , int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //  Question 2: Find second-largest element in the array
//    Way 1;
    public static int secondLargestNum(int[] arr , int n) {
    int firstLargest = arr[n -1];
    for(int i = n - 2; i >= 0 ; i--){
        if(arr[i] != firstLargest && arr[i] < firstLargest){
            firstLargest = arr[i];
            break;
        }
    }
        return firstLargest;
    }
//    Way 2;
    public static int secondLargestNum2(int[] arr , int n) {
        int firstMax = arr[0];
        for (int i = 0; i < n; i++) {
            if (firstMax < arr[i]) {
                firstMax = arr[i];
            }
        }
        int secondMax = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(secondMax < arr[i] && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
//    Way 3;
    public  static int secondLargestNum3(int[] arr , int arrLength){
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arrLength; i++){
            if(firstLargest < arr[i]){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

