package Array.LinearSearch;

public class Find_Max {
    public static void main(String[] args) {
        int[] arr = {23, 24, 353, 6, 12, 115, 34, 545, 655, 44, 76};
        int MaxNum = findMax(arr);
        System.out.println(MaxNum);

    }

    static int findMax(int[] arr) {
        int MaxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (MaxValue < arr[i]) {
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
}
