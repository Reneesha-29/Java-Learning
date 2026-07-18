package leetcode_strings;

public class Leetcode1768 {
    static void main() {
        String a = "abcd";
        String b = "pq";
        String c = merge(a,b);
        System.out.println(c);
    }
    static String merge(String word1, String word2){
        String a = "";
        int i = 0;
        // Loop until both words are fully processed
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                a = a + word1.charAt(i);
            }
            if (i < word2.length()) {
                a = a + word2.charAt(i);
            }
            i++;
        }
        return a;
    }
}
