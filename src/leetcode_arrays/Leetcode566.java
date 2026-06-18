package leetcode_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode566 {
    static void main() {
        int mat[][] = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        ArrayList<Integer> list = new ArrayList<>();
        int res[][] = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m+n];
        if(m*n != r*c) {
            System.out.println(mat);
        }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(mat[i][j]);
                }
            }
            int k=0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    res[i][j] = list.get(k);
                    k++;
                }
            }
            System.out.println(list);
            System.out.println(Arrays.deepToString(res));

    }
}
