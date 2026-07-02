package leetcode_search;

public class Leetcode540 {
    static void main() {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(single(nums));
    }
    static int single(int[] nums){
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            int target = nums[i];
//            int start1 = 0;
//            int end1 = n-1;
//            int arr[] = new int[2];
//            while(start1 <= end1){
//                int mid = start1 + (end1 - start1)/2;
//                if(nums[mid] == target){
//                    arr[0] = mid;
//                    end1 = mid - 1;
//                }
//                else if(nums[mid] > target){
//                    end1 = mid - 1;
//                }
//                else{
//                    start1 = mid + 1;
//                }
//            }
//            int start2 = 0;
//            int end2 = n-1;
//            while(start2<=end2){
//                int mid = start2 + (end2 - start2)/2;
//                if(nums[mid] == target){
//                    arr[1] = mid;
//                    start2 = mid + 1;
//                }
//                else if(nums[mid] > target){
//                    end2 = mid - 1;
//                }
//                else{
//                    start2 = mid + 1;
//                }
//            }
//            if(arr[0] == arr[1]){
//                return nums[i];
//            }
//        }
//        return -1;

        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mid%2 != 0){
                mid = mid - 1;
            }
            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }
            else{
                end = mid;
            }

        }
        return nums[start];
    }
}

