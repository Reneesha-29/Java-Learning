package leetcode_search;

public class Leetcode1346 {
    static void main() {
        int arr[] = {7,1,14,11};
        System.out.println(mult(arr));
    }
    static boolean mult(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        for(int i=n-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}