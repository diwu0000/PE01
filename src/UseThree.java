/**
 * this program asks for input of three names, then print out
 * a greeting with the names in reverse
 */

import java.util.Scanner;

public class UseThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StdOut.println("Please print three names.");
        StdOut.print("Name 1: ");
        String name1 = scan.next();
        StdOut.print("Name 2: ");
        String name2 = scan.next();
        StdOut.print("Name 3: ");
        String name3 = scan.next();

        StdOut.println("Hi " + name3 + ", " + name2 + ", and " + name1 + ".");
    }
}
