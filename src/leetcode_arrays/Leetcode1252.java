package leetcode_arrays;

public class Leetcode1252 {
    static void main() {
        int m = 2;
        int n = 3;
        int arr[][] = new int[m][n];
        int indices[][] = {{0,1},{1,1}};
        int a = indices.length;
        for(int i=0; i<a; i++){
            int tr = indices[i][0];
            int tc = indices[i][1];
            for(int j=0; j<n; j++){
                arr[tr][j] = arr[tr][j] + 1; //row
            }
            for(int k=0; k<m; k++){
                arr[k][tc] = arr[k][tc] + 1; //column
            }
        }
        int odd = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]%2 != 0){
                    odd = odd+1;
                }
            }
        }
        System.out.println(odd);;
    }
}
