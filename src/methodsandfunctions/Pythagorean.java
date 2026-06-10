package methodsandfunctions;

import java.util.Scanner;

public class Pythagorean {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        pyt(a,b,c);
    }
    static void pyt(int p, int q, int r){
        int max = p;
        if(q>max){
            max = q;
        }
        if(r>max){
            max = r;
        }
        System.out.println("Maximum value is " + max);
        int x = p*p;
        int y = q*q;
        int z = r*r;
        if(x==y+z || y==z+x || z==x+y){
            System.out.println("Satisfies");
        }
        else{
            System.out.println("Does not satisfy");
        }
    }
}
