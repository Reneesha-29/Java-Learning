package leetcode_sort;

public class Leetcode1464 {
    static void main() {
        int nums[] = {3,4,5,2};
        int mult = prod(nums);
        System.out.println(mult);
    }
    static int prod(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int last = n-1-i;
            int maxIndex = maxx(nums, 0, last);
            swap(nums, maxIndex, last);
        }
        int ans = (nums[n-1]-1) * (nums[n-2]-1);
        return ans;
    }
    static int maxx(int[] nums, int a, int b){
        int maxx = 0;
        int maxval = Integer.MIN_VALUE;
        for(int i=0; i<=b; i++){
            if(nums[i] > maxval){
                maxval = nums[i];
                maxx = i;
            }
        }
        return maxx;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
