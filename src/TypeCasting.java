import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //type casting
        int num1 = (int)(67.345f);
        System.out.println(num1);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);  //257%256
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;  //automatically converts into integer to solve the expression, therefore the product of a and b is stored as integer
//        System.out.println(d);
//
//        int num2 = 'A'; //ASCII value
//        System.out.println(num2);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f * b) + " " +(i / c) + " " + (d - s));
        System.out.println(result);
    }
}
