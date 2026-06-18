package leetcode_arrays;

import java.util.HashSet;

public class Leetcode1832 {
    static void main() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            uniqueLetters.add(ch);
        }
//        return uniqueLetters.size() == 26;
        if(uniqueLetters.size()==26){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
