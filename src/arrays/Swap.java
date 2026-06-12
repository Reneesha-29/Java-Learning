package arrays;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {
    static void main() {
        int[] arr = {1,2,3,4,5};
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
