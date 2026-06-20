package contestqs;
//You are given three integers l, r and k.
//A number is considered good if the absolute difference between every pair of adjacent digits is at most k.
//Return the number of good integers in the range [l, r] (inclusive).
//The absolute difference between values x and y is defined as abs(x - y).

import java.util.ArrayList;
import java.util.Arrays;

//Example 1:
//
//Input: l = 10, r = 15, k = 1
//
//Output: 3
//
//Explanation:
//
//The good integers in the range are 10, 11, and 12.
//For 10, abs(1 - 0) = 1.
//For 11, abs(1 - 1) = 0.
//For 12, abs(1 - 2) = 1.
//All these differences are at most k = 1. Thus, the answer is 3.
//Example 2:
//
//Input: l = 201, r = 204, k = 2
//
//Output: 2
//
//Explanation:
//
//The good integers in the range are 201 and 202.
//For 201, abs(2 - 0) = 2 and abs(0 - 1) = 1.
//For 202, abs(2 - 0) = 2 and abs(0 - 2) = 2.
//Thus, the answer is 2.  ©leetcode
public class Q1 {
    static void main() {
        int r = 204;
        int l = 201;
        int k = 2;
        System.out.println(good(r,l,k));
    }
    static int good(int r, int l, int k){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int c = 0;
        for(int i=l; i<=r; i++){
            int num = i;
            ArrayList<Integer> current = new ArrayList<>();
            while(num>0){
//                int temp = num;
                int a = num % 10;
//                temp = temp/10;
                current.add(0,a);
                num = num/10;
            }
            list.add(current);
//            return list;
        }
//        return list;
        int n = list.size();
        int m = list.get(0).size();
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m-1; j++){
                if(Math.abs(list.get(i).get(j) - list.get(i).get(j+1)) <= k){
                    count = count + 1;
                }
            }
            if(count == m-1){
                c = c+1;
            }
        }
        return c;
    }
}
