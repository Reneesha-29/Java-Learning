package patterns;

public class Pattern9 {
//            *********
//             *******
//              *****
//               ***
//                *
    static void main() {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<2*n-i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
