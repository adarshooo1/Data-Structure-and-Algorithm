package Array;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_The_Greatest_Number_Of_Candies {
    public static void main(String[] args) {
        int arr[] = {2,7,8};
        int candies = 1;
        List<Boolean> NewCandyArray = kidsWithCandies(arr, candies);
        System.out.println(NewCandyArray);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> KidWithMaxCandies = new ArrayList<>(candies.length);
        int MaxCandy = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            MaxCandy = Math.max(MaxCandy,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= MaxCandy) {
                    KidWithMaxCandies.add(true);
                }else {
                    KidWithMaxCandies.add(false);
                }
            }
            return KidWithMaxCandies;
        }
}
