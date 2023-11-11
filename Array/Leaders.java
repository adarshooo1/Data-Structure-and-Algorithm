package Array;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {18, 5, 9, 6, 11, 10, 7};
        Brute(arr);
    }

    static void Brute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
