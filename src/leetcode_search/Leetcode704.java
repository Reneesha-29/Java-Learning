package leetcode_search;

public class Leetcode704 {
    static void main() {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarysearch(nums, target));
    }
    static int binarysearch(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
