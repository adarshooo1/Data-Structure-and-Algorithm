package Array;

public class FindSingleOnce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 4};
        int ans = SingleOne(arr);
        System.out.println(ans);

        int ans2 = SingleOne2(arr);
        System.out.println(ans2);

    }

    public static int SingleOne(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int single = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == single) {
                    count++;
                }
            }
            if (count == 1) {
                return single;
            }
        }
        return -1;
    }

    public static int SingleOne2(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
