package leetcode_search;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode4 {
    static void main() {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(median(nums1, nums2));
    }
    static double median(int nums1[], int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        int a = m+n;
        float ans = 0;
        int arr[] = new int[a];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            list.add(nums1[i]);
        }
        for(int i=0; i<n; i++){
            list.add(nums2[i]);
        }
        for(int i=0; i<a; i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        if(a%2!=0){
            int mid = a/2;
            ans = arr[mid];
        }
        else{
            int mid1 = a/2;
            int mid2 = mid1 - 1;
            ans = (float)((arr[mid1] + arr[mid2]) / 2.0);
        }
        return ans;
    }
}
