// Two methods to print maximum and minimum from 3 integer
package Functions;
import java.util.Scanner;

public class MaxandMiniOfThreeInteger {

    static int Max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int Min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = in.nextInt();

        System.out.println("Enter 2nd number:");
        int b = in.nextInt();

        System.out.println("Enter 3rd number:");
        int c = in.nextInt();

        System.out.println("Maximum is " + Max(a, b, c));
        System.out.println("Minimum is " + Min(a, b, c));

        
    }
}
