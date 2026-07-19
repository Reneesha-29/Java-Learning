package leetcode_strings;

public class Leetcode1704 {
    static void main() {
        String s = "booke";
        boolean a = alike(s);
        System.out.println(a);
    }
    static boolean alike(String s){
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                c1 = c1+1;
            }
        }
        for(int i=s.length()/2; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
                c2 = c2+1;
            }
        }
        if(c1!=c2){
            return false;
        }
        return true;
    }
}
