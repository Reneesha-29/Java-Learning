package leetcode_sort;

public class Leetcode628 {
    static void main() {
        int nums[] = {1,2,3};
        System.out.println(maxi(nums));
    }
    static int maxi(int[] nums){
        long maxv[] = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        long minv[] = {Long.MAX_VALUE, Long.MAX_VALUE};
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] >= maxv[0]){
                maxv[0] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] >= maxv[1] && nums[i] < maxv[0]){
                maxv[1] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] >= maxv[2] && nums[i] < maxv[1]){
                maxv[2] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] <= minv[0]){
                minv[0] = nums[i];
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i] <= minv[1] && nums[i] >= minv[0]){
                minv[1] = nums[i];
            }
        }
        long option1 = (long) maxv[0] * maxv[1] * maxv[2];
        long option2 = (long) minv[0] * minv[1] * maxv[0];

        return (int) Math.max(option1, option2);
    }
}
