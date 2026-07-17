package leetcode_strings;

public class Leetcode58 {
    static void main() {
        String s = "Hello World";
        int a = last(s);
        System.out.println(a);
    }
    static int last(String s){
        int cnt = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                cnt++;
            }else{
                if (cnt > 0) {
                    return cnt;
                }
            }
        }
        return cnt;
    }
}
