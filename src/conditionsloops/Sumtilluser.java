package conditionsloops;

import java.util.Scanner;

public class Sumtilluser {
    static void main() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = input.nextInt();
        while (num != 0) {
            sum += num;           // Add the number to the total sum
            num = input.nextInt();  // Ask for the next number
        }
        System.out.println("Sum of all numbers are " + sum);
    }
}
