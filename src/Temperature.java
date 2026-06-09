import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Farenheit is " + tempF);
    }
}
