package sort;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] nums = {6,3,5,1,4,9};
        int n = nums.length;
        divide(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }

    static void divide(int[] nums, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei - si)/2; //si = 0. ei=1, mid = 0
        divide(nums, si, mid);
        divide(nums, mid+1, ei); //divide(1,1)
        conquer(nums, si, mid, ei);
    }
    static void conquer(int[] nums, int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x = 0;
        while(index1<=mid && index2<=ei){
            if(nums[index1]<=nums[index2]){
                merged[x++] = nums[index1++];
            }
            else{
                merged[x++] = nums[index2++];
            }
        }
        while(index1<=mid){
            merged[x++] = nums[index1++];
        }
        while(index2 <= ei){
            merged[x++] = nums[index2++];
        }
//        for(int i=0, j=si; i<merged.length; i++, j++){
//            nums[j] = merged[i];
//        }
        for(int i=0; i<merged.length; i++){
            nums[i+si] = merged[i];
        }
    }
}
