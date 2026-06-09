package conditionsloops;

import java.util.Scanner;

public class ProductSum {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int dig = input.nextInt();
        int sum = 0;
        int prod = 1;
        while(dig > 0){
            sum = sum + (dig % 10);
            prod = prod * (dig % 10);
            dig = dig/10;
        }
        int res = prod - sum;
        System.out.println("The difference between the product and sum of Digits of an Integer is " + res);
    }



}
