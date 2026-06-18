package leetcode_arrays;

public class Leetcode1672 {
    static void main() {
        int arr[][] = {{1,2,3},{3,2,3},{5,5,3}};
        int maxw = 0;
        for(int i=0; i<arr.length; i++){
            int curr = 0;
            for(int j=0; j<arr[i].length; j++){
                curr=curr+arr[i][j];
            }
            maxw = Math.max(curr, maxw);
        }
        System.out.println(maxw);
    }
}
