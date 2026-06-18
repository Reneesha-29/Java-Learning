package leetcode_arrays;

public class Leetcode1295 {
    static void main() {
        int nums[] = {12, 345, 2, 6, 7896};
        int n = nums.length;
        int c = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            while(nums[i]>0){
                count = count +1;
                nums[i] = nums[i]/10;
            }
            if(count%2 == 0){
                c = c+1;
            }
        }
        System.out.println(c);
    }
}
