package leetcode_search;

public class Leetcode85 {
    static void main() {
        int arr[] = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    static boolean search(int nums[], int target){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
