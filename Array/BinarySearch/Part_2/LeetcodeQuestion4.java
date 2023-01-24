//Leetcode Question:-744.Find the smallest Letter greater than target.[NOTE:- Letters wrap around]
package Array.BinarySearch.Part_2;

public class LeetcodeQuestion4 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'l','n','q'};
        char check = letter(letters,'n');
        System.out.println(check);
//        System.out.println(letters.length);
    }

    static char letter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

