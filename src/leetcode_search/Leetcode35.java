package leetcode_search;

public class Leetcode35 {
    static void main() {
        int nums[] = {1, 3, 5, 6};
        int target = 4;
        System.out.println(search(nums, target));
    }
    static int search(int nums[], int target){
        int start = 0;
        int end = nums.length - 1; //3
        while(start<=end){
            int mid = start + (end-start)/2; //2

            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                    return mid;
            }
        }
        return start;
    }
}
