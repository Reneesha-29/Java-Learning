package switchcase;

import java.util.Scanner;

public class NestedSwitch {
    static void main() {
        Scanner in = new Scanner((System.in));
        int empID = in.nextInt();
        String dep = in.next();

        switch (empID) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                switch (dep){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            default:
                System.out.println("Enter valid id");
        }
    }

}
