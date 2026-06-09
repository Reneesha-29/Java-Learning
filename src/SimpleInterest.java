import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal value:");
        int p = input.nextInt();
        System.out.println("Enter the duration the money is borrowed or invested:");
        int t = input.nextInt();
        System.out.println("Enter the rate of interest per year");
        int r = input.nextInt();
        float si = p * r * t / 100;
        System.out.println("The simple interest is " + si);
    }
}
