package methodsandfunctions;

import java.util.Scanner;

public class Greeting {
    static void main() {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String msg = myGreet(name);
        System.out.println(msg);
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
