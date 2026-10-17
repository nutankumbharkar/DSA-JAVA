// Define a method to find out if a number is prime or not.

package Functions;
import java.util.Scanner;
public class PrimeNumOrNot 
{
    static String Prime(int n)
    {
       for (int i = 2; i < n; i++)
       {
           if (n <= 1) 
            {
               return "Not Prime";
            }
         
            if (n % i == 0) 
                {
                   return "Not Prime";
                }
            }
         
         return "Prime";
    }

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=in.nextInt();
        System.out.println(Prime(n));
    }
}
