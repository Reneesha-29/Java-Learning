package basics;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = input.next();
        String rev = "";
        int n = a.length();
        for(int i = 0; i<n; i++){
            rev = rev + a.charAt(n-1-i);
        }
        System.out.println(rev);
        if (a.equals(rev)){
            System.out.println("basics.Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
