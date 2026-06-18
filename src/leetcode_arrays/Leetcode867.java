package leetcode_arrays;

import java.util.Arrays;

public class Leetcode867 {
    static void main() {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int ans[][] = new int[n][m];
        for(int i=0; i<m; i++){
            // int n = matrix[i].length;
            for(int j=0; j<n; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ans));

    }
}

