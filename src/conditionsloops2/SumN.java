package conditionsloops2;

import java.util.Scanner;

public class SumN {
    static void main() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the total numbers: ");
            int n = input.nextInt();
            int sum = 0;
            for(int i=0 ; i<n; i++){
                int num = input.nextInt();
                sum = sum + num;
            }
            System.out.println("The sum of N numbers is " + sum);
        }
    }



