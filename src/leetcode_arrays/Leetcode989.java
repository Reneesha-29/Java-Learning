package leetcode_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode989 {
    static void main() {
        int nums[] = {1,2,0,0};
        int n = nums.length;
        int k = 34;
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i=0; i<n; i++){
            int a = (int)(nums[i]*Math.pow(10, n-1-i));
            num = num+a;
        }
        num = num+k;

//        for(int i=0; i<n; i++){
            while(num>0) {
                int digit = num % 10;
                list.add(digit);
                num = num / 10;
            }
        Collections.reverse(list);
//        }
        System.out.println(list);
    }
}
