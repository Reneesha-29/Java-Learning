package conditionsloops2;

import java.util.Scanner;

public class CgpaCalculator {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of subjects: ");
        int n = input.nextInt();
//        int grade = input.nextInt();
//        int credit = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<n; i++){
            int grade = input.nextInt();
            int credit = input.nextInt();
            sum1 = sum1 + (grade * credit);
            sum2 = sum2 + credit;
        }
        if (sum2 != 0){
            int cgpa = sum1 / sum2;
            System.out.println("The CGPA is " + cgpa);
        }

    }
}
