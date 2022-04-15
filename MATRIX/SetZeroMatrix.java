
/*Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.*/
import java.util.*;

public class SetZeroMatrix {
    public static int[][] SetZeros(int[][] matrix, int m, int n) {
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroColumns = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (zeroRows[i] == true) {
                for (int cols = 0; cols < n; cols++) {
                    matrix[i][cols] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (zeroColumns[j] == true) {
                for (int row = 0; row < m; row++) {
                    matrix[row][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int ans[][] = SetZeros(matrix, m, n);
        System.out.println("The matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
 * INPUT
 * 3
 * 3
 * 1 1 1
 * 1 0 1
 * 1 1 1
 * 
 * OUTPUT
 * 1 0 1
 * 0 0 0
 * 1 0 1
 * 
 */