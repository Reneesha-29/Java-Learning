package leetcode;

import java.util.Arrays;

public class Leetcode1572 {
    static void main() {
        int mat[][] = {{4,6,7},{2,9,4},{5,5,5}};
        int sum = 0;
        int n = mat.length;
        int sum1 = 0;
        int rev[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=i; j<=i; j++){
                sum = sum+mat[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rev[i][j] = mat[i][j];
            }
        }
        for(int i=0; i<n; i++){
//            int m = mat[i].length;
            for(int j=0; j<n/2; j++){
//                rev[i][j] = mat[i][j];
                int temp = rev[i][j];
                rev[i][j] = rev[i][n-1-j];
                rev[i][n-1-j] = temp;
//                if(rev[i][j] == mat[i][j]){
//                    sum = sum - rev[i][j];
//                }
            }
        }
        System.out.println(Arrays.deepToString(rev));
        for(int i=0; i<n; i++){
            for(int j=i; j<=i; j++){
//                sum = sum+mat[i][j];
                    sum = sum+rev[i][j];
                    if(n%2 != 0){
                        if(i == n/2 && j == n/2){
                            sum = sum - rev[i][j];
                        }
                    }
            }
        }

        System.out.println(Arrays.deepToString(mat));
        System.out.println(sum);

        // or
        for(int i=0; i<n; i++){
            for(int j=i; j<=i; j++){
                sum1 = sum1 + mat[i][j];
                sum1 = sum1 + mat[i][n-1-i];
            }
        }
        if (n % 2 != 0) {
            sum1 = sum1 - mat[n/2][n/2];
        }
        System.out.println(sum1);
    }
}
