package conditionsloops2;

import java.util.Scanner;

public class Distance2points {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x1 = 3;
        int y1 = 5;
        int x2 = 7;
        int y2 = 8;
        int x = x2 - x1;
        int y = y2 - y1;
        float dist = (float)(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        System.out.println("The distance between the two points is " + dist);
    }
}
