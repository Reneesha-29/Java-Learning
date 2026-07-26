package patterns;

public class Pattern3 {
//            *****
//            ****
//            ***
//            **
//            *
    static void main() {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
