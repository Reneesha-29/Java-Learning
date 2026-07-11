package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode1122 {
    static void main() {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        int nums[] = sortarray(arr1, arr2);
        System.out.println(Arrays.toString(nums));
    }
    static int[] sortarray(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr1[j] == arr2[i]){
                    list.add(arr2[i]);
                }
            }
        }
        for(int i = 0; i < m; i++) {
            boolean isPresentInArr2 = false;

            for(int j = 0; j < n; j++) {
                if(arr1[i] == arr2[j]) {
                    isPresentInArr2 = true; // Found a match!
                    break; // No need to keep looking for this item
                }
            }

            // If the loop finished and we NEVER found a match, it's a true leftover
            if(!isPresentInArr2) {
                arr.add(arr1[i]);
            }
        }
        Collections.sort(arr);
        list.addAll(arr);

        int nums[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}
