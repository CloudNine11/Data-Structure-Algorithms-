//Wap to print the all the diagonals of a 2D array 
import java.util.*;

public class Diagonal {
    public static void principalDiagonal(int mat[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " , ");
                }
            }
        }
        System.out.println();
    }

    public static void secondaryDiagonal(int mat[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(mat[i][j] + " , ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // // printing the matrix
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(mat[i][j] + " ");
        // }
        // System.out.println();
        // }
        System.out.println("Printing the principal diagonal");
        principalDiagonal(mat, n);
        System.out.println("Printing the secondary diagonal");
        secondaryDiagonal(mat, n);
    }

}

/*
 * output:
 * 3
 * 1 5 2
 * 2 5 3
 * 1 3 2
 * Printing the principal diagonal
 * 1 , 5 , 2 ,
 * Printing the secondary diagonal
 * 2 , 5 , 1 ,
 */
