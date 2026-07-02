package leetcode_search;

import java.util.Arrays;

public class Leetcode1608 {
    static void main() {
        int num[] = {3,9,7,8,3,8,6,6};
        System.out.println(special(num));
    }
    static int special(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<=n; i++){
            int count = greaterequalx(nums, i);
            if(count == i){
                return i;
            }
        }
        return -1;
    }
    static int greaterequalx(int nums[], int i){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int x = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
//            int count = 0;
            if(nums[mid] >= i){
                x = (n-mid);
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
//            x = count;
        }
        return x;
    }
}
