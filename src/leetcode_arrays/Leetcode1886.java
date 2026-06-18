package leetcode_arrays;

import java.util.Arrays;

public class Leetcode1886 {
    static void main() {
        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
        int target[][] = {{1,1,1},{0,1,0},{0,0,0}};
        int n = mat.length;
        int rev[][] = new int[n][n];
        int trans[][] = new int[n][n];
        String res = "false";
        for(int i=0; i<4; i++){

            //transpose
            for(int row=0; row<n; row++){
                for(int col=0; col<n; col++){
                    trans[row][col] = mat[col][row];
                }
            }
            //reverse
            for(int row=0; row<n; row++){
                for(int col=0; col<n; col++){
                    rev[row][col] = trans[row][n-col-1];
                }
            }
            for(int row=0; row<n; row++){
                for(int col=0; col<n; col++){
                    mat[row][col] = rev[row][col];
                }
            }
            System.out.println(Arrays.deepToString(trans));
            System.out.println(Arrays.deepToString(rev));

            if(Arrays.deepEquals(rev,target)){
                res = "true";
                break;
            }
//            else{
//                System.out.println("false");
//                break;
//            }
        }
        System.out.println(res);
//        System.out.println("false");
//        System.out.println("false");
    }
}
