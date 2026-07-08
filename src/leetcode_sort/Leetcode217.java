package leetcode_sort;

import java.util.HashSet;

public class Leetcode217 {
    static void main() {
        int nums[] = {1,2,3,1};
        System.out.println(duplicate(nums));
    }
    static boolean duplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        // Step 2: Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, a duplicate is found
            if (!seen.add(num)) {
                return true;
            }
        }

        // No duplicates found
        return false;
    }
}