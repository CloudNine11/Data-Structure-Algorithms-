/*
PROBLEM STATEMENT:
Transverse a matrix in spiral form and print the elements*/

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SpiralMatrix {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            // creating matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int rowStart = 0;
            int rowEnd = arr.length - 1;
            int colStart = 0;
            int colEnd = arr.length - 1;

            while (rowStart <= rowEnd && colStart <= colEnd) {

                for (int col = colStart; col <= colEnd; col++) {
                    System.out.print(arr[rowStart][col] + " ");
                }
                rowStart++;

                for (int row = rowStart; row <= rowEnd; row++) {
                    System.out.print(arr[row][colEnd] + " ");
                }
                colEnd--;

                for (int col = colEnd; col >= colStart; col--) {
                    System.out.print(arr[rowEnd][col] + " ");
                }
                rowEnd--;
                for (int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(arr[row][colStart] + " ");
                }
                colStart++;

                // System.out.println();
            }
        }
    }
}
/*----------------------------------------------------------------------------------------------------------------------
Input:
1
3
1 2 3 
4 5 6 
7 8 9 
Output:
1 2 3 6 9 8 4 5

*/
