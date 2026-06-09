package conditionsloops;

import java.util.Scanner;

public class Largesttilluser {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max = num2;
        while(num1 != 0){
            if(num1 > max){
                max = num1;
            }
            num1 = input.nextInt();
        }
        System.out.println("The largest number is: " + max);
    }
}
