package leetcode_search;

import java.util.Arrays;

public class Leetcode167 {
    static void main() {
        int num[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(num, target)));
    }
    static int[] sum(int[] numbers, int target){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
