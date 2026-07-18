package leetcode_strings;

public class Leetcode28 {
    static void main() {
        String haystack = "sadbutsad", needle = "sad";
        int a = indexx(haystack, needle);
        System.out.println(a);
    }
    static int indexx(String haystack, String needle){
        if(haystack.contains(needle) == false){
            return -1;
        }
        int a = haystack.length(); //9
        int b = needle.length(); //3
        for (int i = 0; i <= a - b; i++) {
            String window = haystack.substring(i, i + b);
            if (window.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}