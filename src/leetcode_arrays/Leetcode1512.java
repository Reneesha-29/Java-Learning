package leetcode_arrays;

public class Leetcode1512 {
    static void main() {
        int arr[] = {1,2,3,1,1,3};
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                if(arr[i] == arr[j]){
                    count = count+1;
                }
            }
        }
        System.out.println(count);
    }
}
