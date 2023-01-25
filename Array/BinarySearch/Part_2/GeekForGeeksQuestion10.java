//Geek for Geeks Question:Find the rotation count in Rotated Sorted array
package Array.BinarySearch.Part_2;

public class GeekForGeeksQuestion10 {
    public static void main(String[] args) {
        int[] arr = {123,1245,5,9,12};
        int ans = RotationCount(arr);
        System.out.println("Number of rotation is :-"+ ans);

    }

    static int RotationCount(int[] arr) {
        int ans = Pivot(arr);
        return ans + 1;
    }

    static int Pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else end  = mid;
        }
        return -1;
    }
}
