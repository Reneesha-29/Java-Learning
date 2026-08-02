package patterns;

public class Pattern13 {
//                     *
//                    * *
//                   *   *
//                  *     *
//                 *********
    static void main() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars and hollow spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Print stars at boundaries or on the entire bottom row
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
