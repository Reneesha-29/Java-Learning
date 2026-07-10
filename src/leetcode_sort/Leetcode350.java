package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode350 {
    static void main() {
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {3,4};
//        dup(nums1,nums2);
        System.out.println(Arrays.toString(dup(nums1,nums2)));
    }
    static int[] dup(int nums1[], int nums2[]){
        int m = nums2.length;
        int n = nums1.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(nums1[j] == nums2[i]){
                    list.add(nums1[j]);
                    nums1[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i<res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}