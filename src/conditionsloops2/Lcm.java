package conditionsloops2;

import java.util.Scanner;

public class Lcm {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int max = Math.max(a,b);
        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm = lcm + max;
        }
        System.out.println("LCM is " + lcm);
    }
}
