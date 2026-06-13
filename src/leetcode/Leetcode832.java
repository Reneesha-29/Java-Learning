package leetcode;

import java.util.Arrays;

public class Leetcode832 {
    static void main() {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int n = image.length;
        for(int i=0; i<n; i++){
            int m = image[i].length;
            for(int j=0; j<m/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][m-1-j];
                image[i][m-1-j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(image));
        for(int i=0; i<n; i++){
            int m = image[i].length;
            for(int j=0; j<m; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(image));
    }
}