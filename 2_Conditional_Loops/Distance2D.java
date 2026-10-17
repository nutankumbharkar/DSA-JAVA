// Calculate Distance Between Two Points (2D)
import java.util.Scanner;
public class Distance2D 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1=in.nextDouble();
        System.out.println("Enter y1:");
        double y1=in.nextDouble();
        System.out.println("Enter x2:");
        double x2=in.nextDouble();
        System.out.println("Enter y2:");
        double y2=in.nextDouble();

        double Dx=x2-x1;
        double Dy=y2-y1;

        double Distance = Math.sqrt(Dx*Dx+Dy*Dy);
        System.out.println("Distance:" + Distance);
    } 
}
