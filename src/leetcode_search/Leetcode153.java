package leetcode_search;

public class Leetcode153 {
    static void main() {
        int nums[] = {3, 4, 5, 1, 2};
        System.out.println(mini(nums));
    }
    static int mini(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Compare mid with the rightmost element
            if (nums[mid] > nums[end]) {
                // The minimum element must be on the right side
                start = mid + 1;
            } else {
                // The minimum element is mid or to its left
                end = mid;
            }
        }
        // start and end will meet at the minimum element
        return nums[start];
    }
}