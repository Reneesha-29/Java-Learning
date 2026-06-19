package search;

public class Cieling {
        static void main() {
            int arr[] = {-18,-12,-3,4,5,8,11,13,17,20};
            int target = 30;
            System.out.println(cieling(arr, target));
        }
        static int cieling(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            if(target > arr[arr.length - 1]){
                return -1;
            }
            while(start <= end){
//            int mid = (start+end)/2;
                int mid = start + (end-start) /2;
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
            return start;
        }
    }
