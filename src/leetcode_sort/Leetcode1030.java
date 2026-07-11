package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1030 {
    static void main() {
        int rows = 2, cols = 3, rCenter = 1, cCenter = 2;
//        int arr[][] = new int[2][3];
        int arr[][] = distance(rows, cols, rCenter, cCenter);
        System.out.println(Arrays.deepToString(arr));
    }
    static int[][] distance(int rows, int cols, int rCenter, int cCenter){
        ArrayList<int[]> list = new ArrayList<>();
//        int[] arr = {rCenter, cCenter};
//        list.add(arr);
//        int[][] nums = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                list.add(new int[]{i, j});
            }
        }
        int[][] nums = list.toArray(new int[list.size()][]);

        selection(nums, rCenter,cCenter);
        return nums;
    }
    static void selection(int[][] nums, int rCenter, int cCenter){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int last = n - i - 1;
            int maxindex = getMax(nums, last, rCenter, cCenter);
            swap(nums, maxindex, last);
        }
    }
    static int getMax(int[][] nums, int last, int rCenter, int cCenter){
        int max = 0;
        int maxdist = -1;
        for(int i=0; i<=last; i++){
            int r = nums[i][0];
            int c = nums[i][1];
            int dist = Math.abs(r - rCenter) + Math.abs(c - cCenter);
            if(dist > maxdist){
                maxdist = dist;
                max = i;
            }
        }
        return max;
    }
    static void swap(int[][] nums, int maxIndex, int last){
        int[] temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }
}
