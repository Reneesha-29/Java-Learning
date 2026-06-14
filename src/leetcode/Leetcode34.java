package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode34 {
    static void main() {
        int nums[] = {5,7,7,8,8,10};
        int target = 6;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                list.add(i);
                break;
            }

        }
        for(int i=n-1; i>=0; i--){
            if(nums[i] == target){
                list.add(i);
                break;
            }
        }
        if(list.isEmpty()){
//            list = new ArrayList<>();
            list.add(-1);
            list.add(-1);
        }
        System.out.println(list);
    }
}
