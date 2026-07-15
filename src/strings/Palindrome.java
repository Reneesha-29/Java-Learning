package strings;

public class Palindrome {
    static void main() {
        String name = "mom";
        System.out.println(isPalin(name));
    }
    static boolean isPalin(String str){
        if(str.length() == 0 || str == null){
            return true;
        }
        str.toLowerCase();
        for(int i=0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;

    }
}
