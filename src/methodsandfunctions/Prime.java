package methodsandfunctions;

import java.util.Scanner;

public class Prime {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=a+1; i<b; i++){
            prime(i);
        }
    }
    static void prime(int p){
        for(int i=2; i<p; i++){
            if(p%i==0){
                return;
            }
        }
        System.out.println(p);
    }
}
