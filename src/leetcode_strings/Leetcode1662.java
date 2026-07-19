package leetcode_strings;

public class Leetcode1662 {
    static void main() {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        boolean a = equi(word1, word2);
        System.out.println(a);
    }
    static boolean equi(String[] word1, String[] word2){
        String a = "";
        String b = "";
        for(int i=0; i<word1.length; i++){
            a = a + word1[i];
        }
        for(int i=0; i<word2.length; i++){
            b = b + word2[i];
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
