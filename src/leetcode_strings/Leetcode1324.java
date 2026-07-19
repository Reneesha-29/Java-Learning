package leetcode_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1324 {
    static void main() {
        String s = "HOW ARE YOU";
        List<String> list = vertical(s);
        System.out.println(list);
    }
    static List<String> vertical(String s){
        String[] words = s.split(" ");
        int a = words.length;
        List<String> list = new ArrayList<>();

        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        for (int i = 0; i < maxLength; i++) {
            StringBuilder sb = new StringBuilder();

            // Inner loop goes through each word to pick up the i-th character
            for (String word : words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(" "); // Append space if the word is shorter than index 'i'
                }
            }

            // 4. Remove trailing spaces from the current column before adding to the list
            list.add(trimRight(sb.toString()));
        }
        return list;
    }
    private static String trimRight(String str) {
        int len = str.length();
        while (len > 0 && str.charAt(len - 1) == ' ') {
            len--;
        }
        return str.substring(0, len);
    }
}
