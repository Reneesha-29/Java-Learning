package conditionsloops2;

import java.util.Scanner;

public class AverageMarks {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int sub = input.nextInt();
        int sum = 0;
        for(int i=0 ; i<sub; i++){
            int marks = input.nextInt();
            sum = sum + marks;
        }
        int avg = sum/sub;
        System.out.println("The average marks is " + avg);
    }
}
