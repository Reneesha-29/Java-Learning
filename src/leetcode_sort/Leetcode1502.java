package leetcode_sort;

public class Leetcode1502 {
    static void main() {
        int nums[] = {3,5,2};
        System.out.println(arithmetic(nums));
    }
    static boolean arithmetic(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
        for(int i=1; i<n; i++){
            int diff = arr[1] - arr[0];
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
