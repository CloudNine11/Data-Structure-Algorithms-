/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/
//package com.company;

import java.util.*;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        Search2DMatrix ob = new Search2DMatrix();
        // ob.searchMatrix(matrix, target);
        System.out.println(ob.searchMatrix(matrix, target));
    }
}

/*--------------------------------------------------------------------------------------------------------------
OUTPUT:
Input: matrix = [1,3,5,7],[10,11,16,20],[23,30,34,60]
target = 3
Output: true
*/
