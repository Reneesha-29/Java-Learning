package conditionsloops2;

import java.util.Scanner;

public class FutureIV {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the present value: ");
        int p = input.nextInt();
        System.out.println("Enter the interest rate: ");
        float r = input.nextFloat();
        System.out.println("Enter the number of periods: ");
        int n = input.nextInt();
        float fv = (float)(p * Math.pow(1+r, n));
        System.out.println("The future investment value is " + fv);
    }
}
