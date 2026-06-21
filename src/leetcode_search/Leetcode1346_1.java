package leetcode_search;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1346_1 {
    static void main(String[] args) {
    int arr[] = {7,1,14,11};
//    arr = mult(arr);
//    System.out.println(Arrays.toString(arr));
        System.out.println(mult(arr));
}
    static boolean mult(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int mul[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            mul[i] = 2*arr[i];
        }
        for(int i=0; i<n; i++){
            int target = mul[i];
            int start = 0;
            int end = n-1;

            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target && mid!=i){
                    return true;
                }
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
