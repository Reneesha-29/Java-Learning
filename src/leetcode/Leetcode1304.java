package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode1304 {
    static void main() {
        int n=5;
        int ans[] = new int[n];
        for(int i=0; i<n/2; i++){
            ans[i] = i+1;
            ans[n-1-i] = -(i+1);
        }
        System.out.println(Arrays.toString(ans));;
    }
}
