package methodsandfunctions;

public class Swap {
    static void main() {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        String name = "Renee";
        changeName(name);
        System.out.println(name);
    }
    static void swap(int p, int q){
        int temp = p;
        p = q;
        q = temp;
    }
    static void changeName(String naam){
        naam = "Tanu";  //creating a new object
        System.out.println(naam);
    }
}
