// Write a program to print the circumference and area of a circle of radius 
// entered  by user by defining your own method.

package Functions;

import java.util.Scanner;

public class AreaofCircleAndCircumference 
{

    static double AreaofCircle(double r)
    
    {
        double circle= Math.PI * r * r;
        return circle;
    }
    static double circumference(double r)
    {
        double Circum= 2 * Math.PI * r;
        return Circum;
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r=in.nextDouble();

        System.out.println("AreaofCircle = "  + AreaofCircle(r));
        System.out.println("Circumference = "  + circumference(r) );

    }
}
