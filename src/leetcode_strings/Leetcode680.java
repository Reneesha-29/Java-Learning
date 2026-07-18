package leetcode_strings;

public class Leetcode680 {
    static void main() {
        String s = "abca";
        boolean a = palin(s);
        System.out.println(a);
    }
    static boolean palin(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return remove(s);
            }
        }
        return true;
    }
    static boolean remove(String s){
        int c = 0;
        for(int i=0; i<s.length(); i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            String result = sb.toString();
            boolean ispalin = true;
            for(int j=0; j<sb.length()/2; j++){
                if(sb.charAt(j) != sb.charAt(sb.length()-1-j)){
                    ispalin = false;
                    break;
                }
            }
            if(ispalin == true){
                return true;
            }
        }

        return false;
    }
}
