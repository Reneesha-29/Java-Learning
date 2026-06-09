package conditionsloops;

import java.util.Scanner;

public class Area {
    static void main() {
        Scanner input = new Scanner(System.in);
        //Area of circle
        System.out.println("Enter the radius: ");
        int r = input.nextInt();
        float ac = (float)(3.14 * r * r);
        System.out.println("Area of circle is: " + ac);

        //Area of triangle
        System.out.println("Enter the base and height of the triangle");
        int h = input.nextInt();
        int b1 = input.nextInt();
        float at = (float)(0.5 * b1 * h);
        System.out.println("Area of triangle is: " + at);

        //Area of Rectangle
        System.out.println("Enter the sides of rectangle: ");
        int l = input.nextInt();
        int b2 = input.nextInt();
        float ar = (float)(l * b2);
        System.out.println("Area of rectangle is: " + ar);

        //Area of parallelogram
        System.out.println("Enter the base and height:");
        int h3 = input.nextInt();
        int b3 = input.nextInt();
        float ap = (float)(b3 * h);
        System.out.println("Area of parallelogram is: " + ap);

        //Area of Rhombus
        System.out.println("Enter the diagonals:");
        int d1 = input.nextInt();
        int d2 = input.nextInt();  //d1 and d2 are the diagonals
        float ar2 = (float)(0.5 * d1 * d2);
        System.out.println("Area of rhombus is: " + ar2);

        //Area of equilateral triangle
        System.out.println("Enter the side : ");
        int s = input.nextInt();
        float ae = (float)((Math.sqrt(3) / 4) * s * s);
        System.out.println("Area of equilateral triangle is: " + ae);
    }
}
