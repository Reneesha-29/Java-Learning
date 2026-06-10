package methodsandfunctions;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        oddeven(num);

    }
    static void oddeven(int a){
        if(a%2 != 0){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }

}
