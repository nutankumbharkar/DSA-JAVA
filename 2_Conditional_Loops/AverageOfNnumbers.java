//  Calculate Average Of N Numbers
import java.util.Scanner;

public class AverageOfNnumbers 
{
  public static void main(String[] args)
  {
     Scanner in=new Scanner (System.in);
     System.out.println("How many numbers?");
     int n = in.nextInt();
     
     int sum =0;
     
    for(int i=0;i<n;i++)
    {
       System.out.println("Enter a number");
       int num =in.nextInt();
      sum =sum +num;

       double avg = (double) sum / n;
      System.out.println(+ avg);
       
    }
    
   

  } 
   
}
