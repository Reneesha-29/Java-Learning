package conditionsloops2;

import java.util.Scanner;

public class Sumno {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum1 = 0; //negative numbers
        int sum2 = 0; //even numbers
        int sum3 = 0; //even numbers
        while (num != 0){
            if(num<0){
                sum1 = sum1 + num;
            }
            else if(num%2==0){
                sum2 = sum2 + num;
            }
            else{
                sum3 = sum3 + num;
            }
            num = input.nextInt();
        }
        System.out.println("Sum of negative numbers is " + sum1);
        System.out.println("Sum of even numbers is " + sum2);
        System.out.println("Sum of odd numbers is " + sum3);
    }
}
