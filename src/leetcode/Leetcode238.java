package leetcode;

import java.util.Arrays;

public class Leetcode238 {
    static void main() {
        int nums[] = {1,2,3,4};
        int n = nums.length;
        int arr[] = new int[n];
        int leftprod = 1;
        for(int i=0; i<n; i++){
            arr[i] = leftprod;
            leftprod = leftprod * nums[i];
        }
        int rightprod = 1;
        for(int i=n-1; i>=0; i--){
            arr[i] = arr[i] * rightprod;
            rightprod = rightprod * nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
