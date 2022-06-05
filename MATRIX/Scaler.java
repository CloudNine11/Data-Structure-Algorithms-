
//Wap to check whether a matrix is scaler or not
import java.util.*;

public class Scaler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (mat[i][j] != mat[0][0]) {
                        flag = 1;
                        break;
                    }
                } else {
                    if (mat[i][j] != 0) {
                        flag = 1;
                        break;
                    }
                }
            }
        }

        if (flag == 0) {
            System.out.println("The matrix is scaler ");
        } else {
            System.out.println("The matrix is not scaler");
        }

    }
}

/*
 * 8 0 0 0
 * 0 8 0 0
 * 0 0 8 0
 * 0 0 0 8
 * The matrix is scaler
 */
