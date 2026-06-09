package basics;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = input.nextInt();
        System.out.print("basics.Fibonacci Series: " + a + " " + b);
        for( int i=2; i<n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
