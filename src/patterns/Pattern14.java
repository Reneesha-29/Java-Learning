package patterns;

public class Pattern14 {
//            *********
//             *     *
//              *   *
//               * *
//                *
    static void main() {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=2 * (n - 1) - i; k++){
                if(i==0 || k == i || k == (2 * (n - 1) - i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
