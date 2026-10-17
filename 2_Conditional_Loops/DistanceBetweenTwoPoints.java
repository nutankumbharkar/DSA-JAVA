// Calculate Distance Between Two Points of Straight line 
import java.util.Scanner;
public class DistanceBetweenTwoPoints 
{
  public static void main(String[] args) 
  {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter 1st point  Distance: ");
      double  p1=in.nextDouble();
      System.out.println("Enter 2nd point Distance: ");
      double  p2=in.nextDouble();

     

      double Total= Math.abs(p2 - p1);
      System.out.println("Total Distance:" +Total);
  }  
  
}
