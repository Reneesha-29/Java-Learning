package methodsandfunctions;

import java.util.Scanner;

public class Voting {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = in.nextInt();
        vote(age);
    }
    static void vote(int n){
        if(n >= 18){
            System.out.println("Can vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }

}
