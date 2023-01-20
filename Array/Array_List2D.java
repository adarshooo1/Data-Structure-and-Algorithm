package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List2D {
    public static void main(String[] args) {
        // Like this way we can make a multi-Dimensional Array.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // Print Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);


    }
}
