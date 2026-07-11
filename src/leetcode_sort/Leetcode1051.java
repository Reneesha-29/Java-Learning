package leetcode_sort;

import java.util.Arrays;

public class Leetcode1051 {
    static void main() {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heights(nums));
    }
    static int heights(int[] heights){
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(arr[i] != heights[i]){
                count = count + 1;
            }
        }
        return count;
    }
}