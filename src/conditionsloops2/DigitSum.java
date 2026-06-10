package conditionsloops2;

import java.util.Scanner;

public class DigitSum {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println("The sum of digits are " + sum);
    }
}
