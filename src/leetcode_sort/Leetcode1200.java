package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1200 {
    static void main() {
        int nums[] = {4,2,1,3};
        System.out.println(diff(nums));
    }
    static List<List<Integer>> diff(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minn = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            int sub = arr[i+1] - arr[i];
            if(sub < minn){
                minn = sub;
            }
        }
//        ArrayList<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            if(arr[i+1] - arr[i] == minn){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);
            }
        }
        return list;
    }
}

