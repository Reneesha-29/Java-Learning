package patterns;

public class Pattern5 {
    static void main() {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
//        System.out.println("");
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
