package Recursion.Part_3;

public class Find_IsArraySorted {
    public static void main(String[] args) {
        //Here find that array is sorted with the help of recursion.
        int[] arr = {2, 3, 4, 6, 7, 18, 20};
        System.out.println(checkSorted(arr, 0));


    }

    static Boolean checkSorted(int[] arr, int index) {
        //Base condition
        if (index == arr.length - 1) {
            return true;
        }
        //Condition
        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
        //Here what is happening that first it is making comparison between the index and index + 1 element then it
        // goes to call the recursive function then it will call the array again and add 1 to the Index and update and
        // return true,When again function will run then the index value is updated with index + 1 and other comparative
        // index + 1 will be [(index + 1) + 1] and this will go till the array.length -1 which is the last value/item of
        // the array. If any of the condition not matched then it will return false.
    }
}
