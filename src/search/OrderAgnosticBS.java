package search;

public class OrderAgnosticBS {
    static void main() {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int target = 7;
        System.out.println(binary(arr, target));
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isasc = true;
//        }
//        else{
//            isasc = false;
//        }
        while(start <= end){
//            int mid = (start+end)/2;
            int mid = start + (end-start) /2;
            if(arr[mid] == target){
                return mid;
            }
            if(isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
//
        }
        return -1;
    }
}