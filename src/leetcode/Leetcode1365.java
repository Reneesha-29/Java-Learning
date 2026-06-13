package leetcode;

import java.util.Arrays;

public class Leetcode1365 {
    static void main() {
        int arr[] = {8,1,2,2,3};
        int n = arr.length;
        int result[] = new int[n];
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j]<arr[i]){
                    count = count+1;
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
//        return result;
    }
}
