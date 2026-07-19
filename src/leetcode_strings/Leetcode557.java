package leetcode_strings;

import java.util.Arrays;

public class Leetcode557 {
    static void main() {
        String s = "Let's take LeetCode contest";
        String a = reverse(s);
        System.out.println(a);
    }
    static String reverse(String s){
        String[] words = s.split(" ");
        String q = "";
//        return words;
        for(int i=0; i<words.length; i++){
            String a = words[i];

            String p = "";
            for(int j=a.length()-1; j>=0; j--){
                p = p + a.charAt(j);
            }
            q = q + p + " ";
        }
        return q.trim();
    }
}
