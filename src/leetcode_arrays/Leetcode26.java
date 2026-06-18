package leetcode_arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode26 {
    static void main() {
        int nums[] = {1,1,2};
        HashSet<Integer> list = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            list.add(nums[i]);
        }
        Integer[] unique = list.toArray(new Integer[0]);
        int m=list.size();
        Arrays.sort(unique);
        for (int i = 0; i < m; i++) {
//            Arrays.sort(unique[i]);
            nums[i] = unique[i];

        }

        System.out.println(m);;

    }
}
