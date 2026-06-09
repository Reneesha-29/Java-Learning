package conditionsloops;

import java.util.Scanner;

public class Perimeter {
    static void main() {
        Scanner input = new Scanner(System.in);
        //Perimeter of circle
        System.out.println("Enter the radius: ");
        int r = input.nextInt();
        float pc = (float)(3.14 * 2 * r);
        System.out.println("Perimeter of circle is: " + pc);

        //Perimeter of Rectangle
        System.out.println("Enter the sides of rectangle: ");
        int l = input.nextInt();
        int b2 = input.nextInt();
        float pr = (float)(2 * (l+b2));
        System.out.println("Perimeter of rectangle is: " + pr);

        //Perimeter of parallelogram
        System.out.println("Enter the base and height:");
        int h3 = input.nextInt();
        int b3 = input.nextInt();
        float pp = (float)(2 * (h3 + b3));
        System.out.println("Perimeter of parallelogram is: " + pp);

        //Perimeter of Rhombus
        System.out.println("Enter the side:");
        int a = input.nextInt();
        float pr2 = 4 * a;
        System.out.println("Perimeter of rhombus is: " + pr2);

        //Perimeter of equilateral triangle
        System.out.println("Enter the side : ");
        int s = input.nextInt();
        float pe = 3 * s;
        System.out.println("Perimeter of equilateral triangle is: " + pe);
    }
}
