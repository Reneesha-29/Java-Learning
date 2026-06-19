package leetcode_search;

public class Leetcode852 {
    static void main() {
        int arr[] = {0,4,3,2,1,0};
        System.out.println(peak(arr));
    }
    static int peak(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if we are on the climbing side of the hill
            if (arr[mid] < arr[mid + 1]) {
                // The peak is to the right
                start = mid + 1;
            } else {
                // The peak is to the left or is the mid element itself
                end = mid;
            }
        }
        // start and end will meet at the peak index
        return start;
    }
}