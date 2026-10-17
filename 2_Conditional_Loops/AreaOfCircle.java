// Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle 
{
   public static void main(String[] args) 
   {
    Scanner in =new Scanner(System.in);

    System.out.println("Enter the Radius:");
    double r =in.nextDouble();
     
    double circle= Math.PI*r*r; 

    System.out.println("Area of Circle is " + circle);
   }   
}
