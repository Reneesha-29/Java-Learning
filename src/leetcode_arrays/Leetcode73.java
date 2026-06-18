package leetcode_arrays;

import java.util.Arrays;

public class Leetcode73 {
    static void main() {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int n = matrix.length;
        int m = matrix[0].length;

        // Track if the very first row or column originally had a zero
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1. Check if the first row has any zeros
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
            }
        }

        // 2. Check if the first column has any zeros
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        // 3. Use the first row and column as flags for the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark this row
                    matrix[0][j] = 0; // Mark this column
                }
            }
        }

        // 4. Update the matrix cells based on our flags
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 5. Finally, handle the first row itself if needed
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // 6. Finally, handle the first column itself if needed
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}