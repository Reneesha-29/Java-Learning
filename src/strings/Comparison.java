package strings;

public class Comparison {
    static void main() {
        String a = "Renee";
        String b = "Renee";
        System.out.println(a == b);

        String x = new String("Reneesha");
        String y = new String("Reneesha");
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
