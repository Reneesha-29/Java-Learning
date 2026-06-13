package leetcode;

public class Leetcode1217 {
    static void main() {
        int position[] = {1,2,3};
        int evenCount = 0;
        int oddCount = 0;

        // Loop through all chips to count how many are on even or odd slots
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCount++; // Found an even position
            } else {
                oddCount++;  // Found an odd position
            }
        }

        // The cost is just the size of the smaller pile
        int a = Math.min(evenCount, oddCount);
        System.out.println(a);
    }
}
