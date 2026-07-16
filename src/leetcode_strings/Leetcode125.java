package leetcode_strings;

public class Leetcode125 {
    static void main() {
        String s = "0A";
        System.out.println(ispalin(s));
    }
    static boolean ispalin(String s){
        String res = s.replaceAll("[^a-zA-Z0-9]", "");
//        return res;
        res = res.toLowerCase();
        if(res.length() == 0 || res == null){
            return true;
        }
        for(int i=0; i<res.length()/2; i++){
            char start = res.charAt(i);
            char end = res.charAt(res.length() - i - 1);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
