package methodsandfunctions;

import java.util.Scanner;

public class MaxMin {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = in.nextInt();
        System.out.println("Enter the second number: ");
        int y = in.nextInt();
        System.out.println("Enter the third number: ");
        int z = in.nextInt();
        max(x,y,z);
        min(x,y,z);
    }
    static void max(int a, int b, int c){
        int max = a;
        if(b>a){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("Maximum value is " + max);
    }
    static void min(int a, int b, int c){
        int min = a;
        if(b<a){
            min = b;
        }
        if(c<min){
            min = c;
        }
        System.out.println("The minimum value is " + min);
    }
}
