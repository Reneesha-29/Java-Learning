package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        for(int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
