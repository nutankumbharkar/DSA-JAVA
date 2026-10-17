import java.util.Scanner;

public class PTR
{
   public static void main(String[] args) 
   {
      Scanner sc =new Scanner(System.in);

      System.out.println("Enter a Principle:");
      Double pr =sc.nextDouble();

      System.out.println("Enter a Time :");
      Double t =sc.nextDouble();

      System.out.println("Enter a Rate:");
      Double r =sc.nextDouble();

      System.out.println("Interest : " +  pr*t*r/100);


   }
}
