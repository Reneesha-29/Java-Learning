package conditionsloops;

import java.util.Scanner;

public class Factor {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int num = input.nextInt();
        System.out.println("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
