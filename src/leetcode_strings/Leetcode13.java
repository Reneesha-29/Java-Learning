package leetcode_strings;

public class Leetcode13 {
    public static void main(String[] args) {
        String s = "IV";
        int num = roman(s);
        System.out.println(num); // Output: 3
    }

    static int roman(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));

            // Check if there is a next character and if it's larger than the current one
            if (i + 1 < s.length() && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal; // Subtraction rule (e.g., IV -> -1 + 5 = 4)
            } else {
                total += currentVal; // Normal addition rule
            }
        }
        return total;
    }

    // Helper method to properly map characters to their Roman numeral values
    static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

