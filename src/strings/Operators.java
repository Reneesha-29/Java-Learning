package strings;

import java.util.ArrayList;

public class Operators {
    static void main() {
        System.out.println('a' + 'b'); //ASCII
        System.out.println("a" + "b"); //Concatenate
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Renee" + new ArrayList<>());
    }
}
