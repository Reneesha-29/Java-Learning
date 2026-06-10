package conditionsloops2;

import java.util.Scanner;

public class Vowel {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char a = input.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
