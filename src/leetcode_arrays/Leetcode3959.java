package leetcode_arrays;

public class Leetcode3959 {
    static void main() {
        int n = 19;
        int digitSum = 0;
        int SquareSum = 0;
        while(n>0){
            digitSum = digitSum + (n%10);
            SquareSum = (int)(SquareSum + Math.pow(n%10, 2));
            n = n/10;
        }
        System.out.println(digitSum);
        System.out.println(SquareSum);
        int a = SquareSum - digitSum;
        if(a>=50){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
