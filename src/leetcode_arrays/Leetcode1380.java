package leetcode_arrays;

import java.util.ArrayList;

public class Leetcode1380 {
    static void main() {
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        for (int i = 0; i < m; i++) {
            int min1 = Integer.MAX_VALUE; // Start with a huge placeholder number
            for (int j = 0; j < n; j++) {
                min1 = Math.min(min1, matrix[i][j]);
            }
            rowMin[i] = min1; // Save the smallest number of row i
        }
        for (int j = 0; j < n; j++) {
            int max1 = Integer.MIN_VALUE; // Start with a tiny placeholder number
            for (int i = 0; i < m; i++) {
                max1 = Math.max(max1, matrix[i][j]);
            }
            colMax[j] = max1; // Save the largest number of column j
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        System.out.println(result);
    }
}