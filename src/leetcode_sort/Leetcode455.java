package leetcode_sort;

import java.util.Arrays;

public class Leetcode455 {
    static void main() {
        int g[] = {1,2,3};
        int s[] = {1,1};
        System.out.println(cookies(g,s));
    }
    static int cookies(int g[], int s[]){
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int a = 0;
        int b = 0;
        while(a<m && b<n){
            if(s[b] >= g[a]){
                a++;
            }
            b++;
        }
        return a;
    }
}