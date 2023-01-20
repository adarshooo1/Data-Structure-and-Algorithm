package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(13);
        list.add(22);
        list.add(32);
        list.add(222);
        list.add(122);
        list.add(10);
        list.add(1322);
        list.add(125);
        list.add(112);
        list.add(101);
        list.add(9);
        System.out.println(list);
        System.out.println(list.get(4));
        list.set(0, 10000);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list2.add(sc.nextInt());
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(list2.get(j)+ " ");
        }

    }
}
