package conditionsloops;

import java.util.Scanner;

public class CaseCheck {
    static void main() {
        Scanner input = new Scanner(System.in);

        //trim() means to remove the extra space
        String word = "hello";
        char ch = word.trim().charAt(0);
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
