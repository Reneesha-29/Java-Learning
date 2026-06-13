package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leetcode1732 {
    static void main() {
        int gain[] = {-5,1,5,0,-7};
        int n = gain.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        ans.add(sum);
        for(int i=0; i<n; i++){
            sum = sum + gain[i];
            ans.add(sum);
        }
        System.out.println(Collections.max(ans));
    }
}
