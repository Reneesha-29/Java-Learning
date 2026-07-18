package leetcode_strings;

public class Leetcode1668 {
    static void main() {
        String seq = "ababa";
        String word = "ab";
        int num = repeat(seq, word);
        System.out.println(num);
    }
    static int repeat(String sequence, String word){
        int maxCount = 0;
        String currentCombination = word;
        while (sequence.contains(currentCombination)) {
            maxCount++;
            currentCombination += word;
        }
        return maxCount;
    }
}