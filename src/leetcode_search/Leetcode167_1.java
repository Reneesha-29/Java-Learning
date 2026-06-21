package leetcode_search;

import java.util.Arrays;

public class Leetcode167_1 {
    static void main() {
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(sum(arr, target)));
    }
    static int[] sum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid = left + (right - left)/2;
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }
            if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
