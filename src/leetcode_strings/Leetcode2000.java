package leetcode_strings;

public class Leetcode2000 {
    static void main() {
        String word = "abcdefd";
        char ch = 'd';
        String a = revv(word, ch);
        System.out.println(a);
    }
    static String revv(String word, char ch){
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                return revv(word, i);
            }
        }
        return word;
    }
    static String revv(String s, int a){
        String reverse = "";
        String suffix = "";
        for(int i = a; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        for(int i=a+1; i<s.length(); i++){
            suffix = suffix + s.charAt(i);
        }
        return reverse + suffix;
    }
}
