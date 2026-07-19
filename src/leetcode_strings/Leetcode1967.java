package leetcode_strings;

public class Leetcode1967 {
    static void main() {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int count = substring(patterns, word);
        System.out.println(count);
    }
    static int substring(String[] pattern, String word){
        int count = 0;
        for(int i=0; i<pattern.length; i++){
            String a = pattern[i];
            if(word.contains(a)){
                count++;
            }
        }
        return count;
    }
}
