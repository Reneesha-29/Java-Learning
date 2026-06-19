package leetcode_search;

public class Leetcode154 {
    static void main() {
        int nums[] = {2,2,2,0,1};
        System.out.println(rot(nums));
    }
    static int rot(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[end]){
                end = mid;
            }
            else{
                end--;
            }
        }
        return nums[start];
    }
}
