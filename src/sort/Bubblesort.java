package sort;

import java.util.Arrays;

public class Bubblesort {
    static void main() {
        int arr[] = {1, 4, 2, 7, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if in the first try, nothing gets swapped meaning if swapped = false, then it means this array is sorted.
            if(!swapped){
                break;
            }
        }
    }
}
