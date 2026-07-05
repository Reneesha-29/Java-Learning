package sort;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int nums[] = {2,7,4,5,3};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getmax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
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
