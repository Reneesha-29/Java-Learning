import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
