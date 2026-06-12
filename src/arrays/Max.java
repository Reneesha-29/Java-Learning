package arrays;

public class Max {
    static void main() {
        int[] arr = {1,5,8,3,6};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
