package leetcode_search;

public class Leetcode441 {
    static void main() {
        int num = 10;
        System.out.println(target(num));
    }
    static int target(int n){
        long low = 0;
        long high = n;
        long ans = 0;
        while(low<=high){
            long mid = low + (high-low)/2;
            long a = mid * (mid+1)/2;
            if(a == n){
                return (int)(mid);
            }
            else if(a < n){
                ans = mid;
                low = mid + 1;
            }
            else{  //a>mid    for n = 5, mid = 2, a = 3, high = 5, mid1=1, a1=1
                high = mid - 1;
            }
        }
        return (int)(ans);
    }
}
