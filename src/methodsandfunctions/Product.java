package methodsandfunctions;

import java.util.Scanner;

public class Product {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        prod(a,b);
    }
    static void prod(int x, int y){
        int p = x * y;
        System.out.println("The product is " + p);
    }
}
