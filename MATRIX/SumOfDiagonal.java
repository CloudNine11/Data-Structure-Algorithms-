//Wap to print the sum of the all diagonals of a matrix.
import java.util.*;

public class SumOfDiagonal {
    public static void principalDiagonalSum(int mat[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];

                }
            }
        }
        System.out.println(sum);

    }

    public static void secondaryDiagonalSum(int mat[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    sum = sum + mat[i][j];

                }
            }
        }
        System.out.println(sum);
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
        System.out.println("Sum of principal diagonal: ");
        principalDiagonalSum(mat, n);
        System.out.println("Sum of secondary diagonal");
        secondaryDiagonalSum(mat, n);
    }

}

/*
 * output:
 * 4
 * 1 2 4 3
 * 0 8 1 3
 * 5 0 0 1
 * 1 0 0 1
 * Sum of principal diagonal:
 * 10
 * Sum of secondary diagonal
 * 5
 */
