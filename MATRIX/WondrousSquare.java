/*
PROBLEM STATEMENT:
WONDROUS SQUARE :- Write a program to input n, create matrix in such a manner so that its sum of each row is equal to sum of each column , sum of diagonals is equal.
*/
//package com.company;

import java.util.*;

class TakeInput {
    Scanner sc = new Scanner(System.in);
    int n;
    int arr[][];

    void matrix() {
        System.out.println("Enter the size");
        n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                if (p >= 1 && p <= (n * n)) {
                    arr[i][j] = p;
                } else {
                    j--;
                }
            }
        }
    }

    int sum() {
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum = sum + arr[0][j];
        }

        return sum;
    }

    void compareSum() {
        int p = sum();
        int flag = 1, i, j, s1, s2;
        for (i = 0; i < n; i++) {
            s1 = 0;
            s2 = 0;
            for (j = 0; j < n; j++) {
                s1 = s1 + arr[i][j];
                s2 = s2 + arr[j][i];
            }
            if (s1 != p || s2 != p) {
                flag = 0;
                break;
            }
        }
        s1 = 0;
        s2 = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    s1 = s1 + arr[i][j];
                }
                if (i + j == n - 1) {
                    s2 = s2 + arr[i][j];
                }
            }
        }
        if (s1 != p || s2 != p) {
            flag = 0;

        }

        if (flag == 1) {
            System.out.println("The matrix is a wondrousquare");
        } else {
            System.out.println("The matrix is not a wondrousquare");
        }

    }

    void Display() {
        System.out.println("The Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class WondrousSquareDec3 {
    public static void main(String[] args) {

        TakeInput ob = new TakeInput();
        ob.matrix();
        ob.Display();
        ob.compareSum();

    }
}
/*
 * -----------------------------------------------------------------------------
 * -------------------------------------------------------------------
 * OUTPUT:
 * 3
 * 8 1 6
 * 3 5 7
 * 4 9 2
 * The matrix is a wondrousquare
 * 
 */
