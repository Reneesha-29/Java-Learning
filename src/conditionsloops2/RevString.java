package conditionsloops2;

import java.util.Scanner;

public class RevString {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = input.next();
        String rev = "";
        int n = a.length();
        for(int i = 0; i<n; i++){
            rev = rev + a.charAt(n-1-i);
        }
        System.out.println("Reverse of the string is: " + rev);

    }
}
