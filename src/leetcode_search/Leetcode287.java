package leetcode_search;

public class Leetcode287 {
    static void main() {
        int nums[] = {1,3,4,2,2};
        System.out.println(duplicates(nums));
    }
    static int duplicates(int[] nums){
        int n = nums.length;
        int start = 1;
        int end = n-1;
//        int count = 0;
        while(start<=end){
            int mid = start + (end - start)/2;
            int count = 0;
            for(int i = 0; i<n; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count>mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
