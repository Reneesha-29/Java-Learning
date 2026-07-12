package leetcode_sort;

public class Leetcode1491 {
    static void main() {
        int nums[] = {4000,3000,1000,2000};
        double average = avg(nums);
        System.out.println(average);
    }
    static double avg(int[] salary){
        int n = salary.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j>0; j--){
                if(salary[j] < salary[j-1]){
                    swap(salary, j, j-1);
                }
            }
        }
        int sum = 0;
        for(int i=1; i<n-1; i++){
            sum = sum + salary[i];
        }
        double total = sum/(n-2);
        return total;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
