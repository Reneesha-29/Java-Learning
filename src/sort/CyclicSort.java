package sort;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int nums[] = {3, 5, 1, 4, 2};
        cyclicsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicsort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int index = nums[i] - 1;
            if(nums[i]!= nums[index]){
                swap(nums, i, index);
            }
        }
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
