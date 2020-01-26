/**
 * this program calculates windchill
 */

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        StdOut.println("Input the temperature t (in Fahrenheit) and wind speed (in miles per hour): ");
        Scanner scan = new Scanner(System.in); //ask for user input

        //ask for and check input temperature
        StdOut.print("The temperature is: ");
        double t = scan.nextDouble();
        while (Math.abs(t) > 50){
            StdOut.println("Error. Please try again. ");
            StdOut.print("The temperature is: ");
            t = scan.nextDouble();
        }

        //ask for and check input wind speed
        StdOut.print("The wind speed is: ");
        double v = scan.nextDouble();
        while(v > 120 || v <3){
            StdOut.println("Error. Please try again.");
            StdOut.print("The wind speed is: ");
            v = scan.nextDouble();
        }

        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        StdOut.print("The wind chill is ");
        StdOut.printf("%.2f", w);
    }
}
