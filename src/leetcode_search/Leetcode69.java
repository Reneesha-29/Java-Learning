package leetcode_search;

public class Leetcode69 {
    static void main() {
        int x = 8;
        System.out.println(sqr(x));
    }

    static int sqr(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // We use (mid <= x / mid) instead of (mid * mid <= x)
            // This prevents integer overflow errors for large numbers
            if (mid <= x / mid) {
                ans = mid;     // Save mid as a possible answer
                low = mid + 1; // Try to look for a larger valid square root
            } else {
                high = mid - 1; // mid is too big, look in the lower half
            }
        }
        return ans;
    }
}