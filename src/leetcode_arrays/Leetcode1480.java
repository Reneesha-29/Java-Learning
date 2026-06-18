package leetcode_arrays;

import java.util.Arrays;

public class Leetcode1480 {
    static void main() {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        for(int i = 1; i<n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
