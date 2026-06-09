package basics;

import java.util.Scanner;

public class RupeestoUSD {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Rupees");
        int rup = input.nextInt();
        float dol = (float) (rup / 95.4);
        System.out.println("The amount in dollars is " + dol);
    }
}
