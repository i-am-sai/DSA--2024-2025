//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//Ex: input =[ [1, 1, 1], [1, 0, 1], [1, 1, 1]]
//Output = [[1, 0, 1], [0, 0, 0], [1, 0, 1]]

import java.util.Arrays;
import java.util.Scanner;

public class ZeroMatrix {

    public static void main(String[] args) {
//        int row = 3;
//        int col = 3;
//        int[][] arr = new int[row][col];
//
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr.length);

        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes(matrix);

    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // boolean arrays
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        //step 1: Identify rows and columns that need to be set to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true; // mark the row
                    col[j] = true; // mark the column
                }
            }
        }

        // step 2: Set rows to 0
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // step 3: set columns to 1
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // step 4: print
        for(int[] r: matrix){
            for(int value: r){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}