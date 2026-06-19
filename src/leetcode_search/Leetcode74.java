package leetcode_search;

public class Leetcode74 {
    static void main() {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 11;
        System.out.println(search(matrix, target));
    }
    static boolean search(int matrix[][], int target){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
