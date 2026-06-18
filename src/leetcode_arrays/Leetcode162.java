package leetcode_arrays;

public class Leetcode162 {
    static void main() {
        int nums[] = {3,2,1,2};
        int n = nums.length;
        System.out.println(search(nums));
    }
    static int search(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // You are in the decreasing part of the array
                // This means the peak is to the left (and could be mid itself)
                end = mid;
            } else {
                // You are in the increasing part of the array
                // This means the peak is to the right
                start = mid + 1;
            }
        }
        // start and end will meet at the peak element index
        return start;
    }
}