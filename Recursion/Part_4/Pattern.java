package Recursion.Part_4;

public class Pattern {
    public static void main(String[] args) {
    triangle(5,0);
/*output:
         *****
         ****
         ***
         **
         *
*/

    triangle2(5,0);
/*output:
         *
         **
         ***
         ****
         *****
*/

    }
    static  void triangle(int row , int col){
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            triangle(row , col + 1);
        }else{
            System.out.println();
            triangle(row - 1 , 0);
        }
    }
    static void triangle2(int row , int col){
        if (row == 0) {
            return;
        }
        if (row > col) {
            triangle2(row , col + 1);
            System.out.print("*");

        }else{
            triangle2(row - 1,0  );
            System.out.println();
        }
    }
}
