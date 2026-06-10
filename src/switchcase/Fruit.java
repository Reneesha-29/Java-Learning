package switchcase;

import java.util.Scanner;

public class Fruit {
    static void main() {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        if(fruit.equals("apple")){
//            System.out.println("Red fruit");
//        }
        switch (fruit){
            case "Mango":
                System.out.println("King");
                break;
            case "Apple":
                System.out.println("Red");
                break;
            case "Orange":
                System.out.println("Round");
                break;
            case "Grapes":
                System.out.println("Small");
                break;
            default:
                System.out.println("Enter valid fruit");
        }

    }
}
