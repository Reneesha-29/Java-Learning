package leetcode_search;

import java.util.ArrayList;

public class Leetcode1351 {
    static void main() {
        int mat[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(neg(mat));
    }
    static int neg(int grid[][]){
//        int n = grid.length;
//        int m = grid[0].length;
        ArrayList<Integer> list = new ArrayList<>();

        int n = grid.length;
        for(int i=0; i<n; i++){
            int start = 0;
            int end = grid[0].length - 1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(grid[i][mid] < 0){
                    list.add(grid[start][mid]);
                    end = end - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return list.size();
    }
}
