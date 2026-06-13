package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1389 {
    static void main() {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        int n = nums.length;
        ArrayList<Integer> targetList = new ArrayList<>();
        for(int i=0; i<n; i++){
            targetList.add(index[i], nums[i]);
        }
//        int[] targetArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            targetArray[i] = targetList.get(i);
//        }

        System.out.println(targetList);
//        System.out.println(Arrays.toString(target));
    }
}
