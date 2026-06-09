package conditionsloops;

import java.util.Scanner;

public class Reverse {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int rev = 0;
        while(num>0){
            rev = (rev*10) + (num%10);
            num = num/10;
        }
        System.out.println(rev);
    }
}
