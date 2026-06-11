package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main() {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 63;
        arr[3] = 34;
        arr[4] = 69;
        //[23, 45, 63, 34, 69]
        System.out.println(arr[3]);

        //using for loops
        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
//        for(int i =0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        for(int num : arr){
//            System.out.print(num + "  ");
//        }
        System.out.println(Arrays.toString(arr));;
    }
}
