package conditionsloops;

import java.util.Scanner;

public class Occurance7 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int count = 0;
        int temp = 1;
        while(num>0){
            temp = num%10;
            if(temp == 7){
                count = count+1;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
