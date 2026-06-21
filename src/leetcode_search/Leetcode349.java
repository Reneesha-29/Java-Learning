package leetcode_search;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode349 {
    static void main() {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,1};
        System.out.println(intersect(nums1,nums2));
    }
    static HashSet<Integer> intersect(int nums1[], int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        return list;
    }
}