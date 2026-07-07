package leetcode_sort;

public class Leetcode41 {
    static void main() {
        int[] nums = {3,4,-1,1};
        int missing = cyclic(nums);
        System.out.println(missing);
    }
    static int cyclic(int[] nums){
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            int current = nums[i]-1;
            if(nums[i]<=n && nums[i]>0 && nums[i] != nums[current]){
                swap(nums, i, current);
                i--;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}