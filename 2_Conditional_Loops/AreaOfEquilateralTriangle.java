// Area of Equilateral Triangle
import java.util.Scanner;
public class AreaOfEquilateralTriangle 
{
     public static void main(String[] args) 
     {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the Side of Triangle:");

        double side =in.nextDouble();

        double Area =(Math.sqrt(3)/4)*side*side;

        System.out.println("Area of Equilateral Triangle is " + Area);
     }
}
