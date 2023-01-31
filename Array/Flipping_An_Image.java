//https://leetcode.com/problems/flipping-an-image/solutions/
package Array;

import java.util.Arrays;

public class Flipping_An_Image {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] Flip = flipAndInvertImage(arr);
        for (int i = 0; i < Flip.length; i++) {
            System.out.println(Arrays.toString(Flip[i]));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] newArray = new int[image.length][image.length];
        for (int i = 0; i <= image.length-1; i++) {
            int k = 0;
            for (int j = image[i].length -1; j >= 0; j--) {
                if (image[i][j] == 0) {
                    newArray[i][k++] = 1;
                } else {
                    newArray[i][k++] = 0;
                }
            }
        }
        return newArray;
    }
}
