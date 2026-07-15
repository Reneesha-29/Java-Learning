package strings;

import java.util.Arrays;

public class Methods {
    static void main() {
        String name = "Reneesha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Reneesha   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
