package conditionsloops2;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int prod = 1;
        for(int i = 0; i<num; i++){
            prod = prod * (num - i);
        }
        System.out.println("The factorial of " + num + " is " + prod);
    }
}
