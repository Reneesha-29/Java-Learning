package leetcode_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1331 {
    static void main() {
        int nums[] = {40, 10, 30, 20};
//        rank(nums);
        System.out.println(Arrays.toString(rank(nums)));
    }
    static Integer[] rank(int[] arr){
        int nums[] = arr.clone();
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[j] == arr[i]){
                    list.add(j+1);
                }
            }
        }
        Integer[] rank = list.toArray(new Integer[list.size()]);
        return rank;
    }
}
