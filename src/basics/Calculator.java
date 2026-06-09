package basics;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println("Enter the operation");
        char op = input.next().charAt(0);
        if ( op == '+'){
            int sum = num1 + num2;
            System.out.println("basics.Sum of " + num1 + " and " + num2 + " is " + sum);
        }
        else if (op == '-'){
            int diff = num1 - num2;
            System.out.println("Difference of " + num1 + " and " + num2 + " is " + diff);
        }
        else if (op == '*'){
            int mult = num1 * num2;
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mult);
        }
        else if (op == '/'){
            if(num2 == 0){
                System.out.println("Invalid");
            }
            else{
                int div = num1 / num2;
                System.out.println("Division of " + num1 + " and " + num2 + " is " + div);
            }
        }
        else{
            System.out.println("Invalid operation");
        }

    }
}
