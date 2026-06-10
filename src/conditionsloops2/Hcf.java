package conditionsloops2;

import java.util.Scanner;

public class Hcf {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 values: ");
        int a = input.nextInt();
        int b = input.nextInt();
        while (b != 0){
            int temp = b;
            b = a % b; // Get the remainder
            a = temp;
        }
        System.out.println("HCF is " + a);
    }
}
