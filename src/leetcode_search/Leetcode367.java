package leetcode_search;

public class Leetcode367 {
    static void main() {
        int num = 5;
        System.out.println(sqr(num));
    }
    static boolean sqr(int num){
        long low = 1;
        long high = num;
        if(num == 0 || num ==1){
            return true;
        }
        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid * mid == num){
                return true;
            }
            else if(mid<num/mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}