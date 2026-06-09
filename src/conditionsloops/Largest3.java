package conditionsloops;

import java.util.Scanner;

public class Largest3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);
    }
}
