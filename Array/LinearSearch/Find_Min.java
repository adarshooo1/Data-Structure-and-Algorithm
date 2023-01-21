package Array.LinearSearch;

public class Find_Min {
    public static void main(String[] args) {
        int[] arr = {23, 24, 353, 6, 12, 115, 34, 545, 655, 44, 76};
        int MinNum = findMin(arr);
        System.out.println(MinNum);
    }

    static int findMin(int[] arr) {
        int MinValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (MinValue > arr[i]) {
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
}
