//Define a program to find out whether a given number is even or odd.

package Functions;

import java.util.Scanner;

public class EvenOdd 
{
    static void EvenOrOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+ "  is Even");
        }
        else 
        {
             System.out.println(n+ "  is Odd");
        }
        
        
    }
      public static void main(String[] args) 
      {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
       EvenOrOdd(n);
      }
}
