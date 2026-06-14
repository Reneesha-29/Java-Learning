package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Leetcode189 {
    static void main() {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length; //7
        int a[] = new int[k];
        int m = n-k; //4
        int b[] = new int[m];
        int c[] = new int[m];
        k= k%n;
        if (n == 1) {
            return; // Stops the method early
        }
        for(int i=0; i<m; i++){
            b[i] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            a[i] = nums[m + i];
        }
        for(int i=0; i<k; i++){
            int temp = a[i];
            a[i] = a[k-1-i];
            a[k-1-i] = temp;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int arr[] = new int[m+k];
        for(int i=0; i<k; i++){
            arr[i] = a[i];
        }
        for(int i=0; i<m; i++){
            arr[i+k] = b[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
