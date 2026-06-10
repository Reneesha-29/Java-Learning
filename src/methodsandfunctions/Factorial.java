package methodsandfunctions;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        fact(num);
    }
    static void fact(int n){
        int prod = 1;
        if(n == 0){
            System.out.println("Factorial of 0 is 1");
        }
        else{
            for(int i = 1; i<=n; i++){
                prod = prod * i;
            }
            System.out.println("Factorial is " + prod);
        }
    }
}
