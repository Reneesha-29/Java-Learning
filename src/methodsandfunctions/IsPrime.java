package methodsandfunctions;

import java.util.Scanner;

public class IsPrime {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        prime(num);
    }
    static void prime(int a){
        for(int i=2; i<a; i++){
            if(a%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
