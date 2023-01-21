package Array.LinearSearch;

import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
        String Str = "Adarsh Singh";
        char target = 'r';
        Boolean check = linearSearch(Str, target);
        System.out.println(check);
        System.out.println(Arrays.toString(Str.toCharArray()));//This will print as String Item as an Array of Character.

    }

//  It will return the target element in the array.
    static Boolean linearSearch(String Str, char target) {

        if (Str.length() == 0) {
            return false;
        }

        for (int i = 0; i < Str.length(); i++) {
            if (target == Str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
//Best Time Complexity is O(1) which means the number we are searching is at the 1st index in the array.
//Worst Time Complexity is O(n) which means the number we are searching is at the last index or not present in the array.
//    Here (n) stands for size of the array.

}
