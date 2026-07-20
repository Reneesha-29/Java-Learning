package leetcode_strings;

public class Leetcode848 {
    static void main() {
        String s = "bad";
        int[] shifts = {10,20,30};
        String ans = shift(s, shifts);
        System.out.println(ans);
    }
    static String shift(String s, int[] shifts){
        int n=shifts.length;
//        String ans = new String();
        StringBuilder sb = new StringBuilder();
        int p = 0;
        for(int i=n-1; i>=0; i--){
            p = (p + shifts[i]) % 26;
            char a = (char)('a' + (s.charAt(i) - 'a' + p) % 26);

            sb.append(a);
        }
        sb.reverse();
        return sb.toString();
    }
}
