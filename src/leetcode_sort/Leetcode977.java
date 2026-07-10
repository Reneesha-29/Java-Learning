package leetcode_sort;

import java.util.Arrays;

public class Leetcode977 {
    static void main() {
        int nums[] = {-1, -4, 3, 6, 5};
        int res[] = square1(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] square1(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1; // Start filling result from the end

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }
}
//    static void square(int[] nums){
//        for(int i=0; i<nums.length; i++){
//            nums[i] = nums[i] * nums[i];
//        }
//        insertion(nums);
//    }
//    static void insertion(int[] nums){
//        int n = nums.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j>0; j--){
//                if(nums[j] < nums[j-1]){
//                    swap(j, j-1, nums);
//                }
//            }
//        }
//    }
//    static void swap(int a, int b, int[] nums){
//        int temp = nums[a];
//        nums[a] = nums[b];
//        nums[b] = temp;
//    }
//}
