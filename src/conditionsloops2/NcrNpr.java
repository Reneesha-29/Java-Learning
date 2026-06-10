package conditionsloops2;

import java.util.Scanner;

public class NcrNpr {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of n and r: ");
        int n = input.nextInt();
        int r = input.nextInt();
        int a = n-r;
        int p1 = 1;
        int p2 = 1;
        int p3 = 1;
        for(int i = 1; i<=n; i++){
            p1 = p1 * i; //n factorial
        }
        for(int i = 1; i<=r; i++){
            p2 = p2 * i; //r factorial
        }
        for(int i = 1; i<=a; i++){
            p3 = p3 * i; //(n-r) factorial
        }
        int ncr = p1 / (p2 * p3);
        int npr = p1 / p3;
        System.out.println("nPr = " + npr);
        System.out.println("nCr = " + ncr);
    }
}
