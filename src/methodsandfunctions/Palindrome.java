package methodsandfunctions;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        pal(num);
    }
    static void pal(int n){
        int rev = 0;
        int temp = n;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(rev == n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
