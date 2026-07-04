package leetcode_search;

public class Leetcode81 {
    static void main() {
        int nums[] = {1,0,1,1,1};
        int target = 0;
        System.out.println(binarysearch(nums, target));
    }
    static boolean binarysearch(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left = left + 1;
                right = right - 1;
            }
            else if(nums[left]<nums[mid]){ //first half is sorted
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }
                else{
                    right = mid -1;
                }
            }
        }
        return false;
    }
}

