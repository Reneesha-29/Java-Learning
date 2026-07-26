package leetcode_sort;

public class Leetcode628 {
    static void main() {
        int nums[] = {1,2,3};
        System.out.println(maxi(nums));
    }
    static int maxi(int[] nums){
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;

        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        long max3 = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] > max2){
                max3 = max2;
                max2 = nums[i];
            }
            else if (nums[i] > max3){
                max3 = nums[i];
            }
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        long option1 = (long) max1 * max2 * max3;
        long option2 = (long) max1 * min1 * min2;
        return (int) Math.max(option1, option2);
    }
}