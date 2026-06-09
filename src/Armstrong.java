import java.util.Scanner;

public class Armstrong {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        int temp = a;
        int digits = 0;
        int sum = 0;
        while(temp>0){
            digits = digits + 1;
            temp = temp/10;
        }
        System.out.println(digits);
        temp = a;
        System.out.println(temp);
        while(temp>0){
            int last = temp % 10;
            sum = sum + (int)(Math.pow(last,digits));
            temp = temp/10;
        }
        System.out.println(sum);
        if(a==sum){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}
