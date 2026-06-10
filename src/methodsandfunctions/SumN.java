package methodsandfunctions;

import java.util.Scanner;

public class SumN {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = in.nextInt();
        sum(N);
    }
    static void sum(int a){
        int sum = 0;
        for(int i = 0; i<a; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
