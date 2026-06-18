package leetcode_arrays;

import java.util.Arrays;

public class Leetcode66 {
    static void main() {
        int digits[] = {1,2,9};
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
                int[] newNumber = new int[n + 1];
                newNumber[0] = 1;
                System.out.println(Arrays.toString(newNumber));
    }
}

