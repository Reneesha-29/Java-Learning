package leetcode_sort;

public class Leetcode976 {
    static void main() {
        int nums[] = {1,2,2};
        int per = perimeter(nums);
        System.out.println(per);
    }
    static int perimeter(int[] nums){
        for(int i=0; i<nums.length; i++){
            int last = nums.length - i - 1;
            int maxIndex = getmax(nums, 0, last);
            swap(nums, maxIndex, last);
        }
        int n = nums.length;
        for(int i=n-1; i>=2; i--){
            if(nums[i-2] + nums[i-1] > nums[i]){
                int sum = nums[i-2] + nums[i-1] + nums[i];
                return sum;
            }
        }
        return 0;
    }
    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
