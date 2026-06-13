package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1431 {
    static void main() {
        int arr[] = {2,3,5,1,3};
        int extra = 3;
        int max1 = 0;
        int n = arr.length;
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            max1 = Math.max(max1, arr[i]);
        }
        System.out.println(max1);
        for(int i=0; i<n; i++){
            int curr = arr[i] + extra;
            if(curr>=max1){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        System.out.println(result);
    }
}
