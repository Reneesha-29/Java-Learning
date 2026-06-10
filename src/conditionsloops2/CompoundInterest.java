package conditionsloops2;

import java.util.Scanner;

public class CompoundInterest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int p = input.nextInt();
        System.out.println("Enter the annual interest rate: ");
        float r = input.nextFloat();
        System.out.println("Enter the number of times that interest is compounded per year");
        int n = input.nextInt();
        System.out.println("Enter the time int which the money is invested or borrowed for, in years");
        int t = input.nextInt();
        double c = p * Math.pow( 1 + r/n , n * t);
        System.out.println("The compound interest is " + c);

    }
}
