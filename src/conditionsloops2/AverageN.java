package conditionsloops2;

import java.util.Scanner;

public class AverageN {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i=0; i <= num; i++){
            sum = sum + i;
        }
        int avg = sum/num;
        System.out.println("The average is " + avg);
    }
}
