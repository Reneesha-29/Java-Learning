package basics;

import java.util.Scanner;

public class Greeting {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Hello " + name + ", nice to meet you!");
    }
}
