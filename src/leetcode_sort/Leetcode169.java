package leetcode_sort;

import java.util.Arrays;

public class Leetcode169 {
    static void main() {
        int nums[] = {3,2,3};
        selection(nums);
        int maxi = selection(nums);
        System.out.println(maxi);

    }
    static int selection(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getmax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr[n/2];
    }
    static int getmax(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] <= arr[i]){
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
