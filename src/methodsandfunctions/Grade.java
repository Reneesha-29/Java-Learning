package methodsandfunctions;

import java.util.Scanner;

public class Grade {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = in.nextInt();
        grade(marks);
    }
    static void grade(int m){
        if(m <= 40){
            System.out.println("Fail");
        }
        else if(m > 40 && m <= 50){
            System.out.println("DD");
        }
        else if(m > 50 && m <= 60){
            System.out.println("CD");
        }
        else if(m > 60 && m <= 70){
            System.out.println("BC");
        }
        else if(m > 70 && m <= 80){
            System.out.println("BB");
        }
        else if(m > 80 && m <= 90){
            System.out.println("AB");
        }
        else{
            System.out.println("AA");
        }
    }
}
