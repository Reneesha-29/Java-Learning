package conditionsloops2;

import java.util.Scanner;

public class PerfectNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i<num ; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}
