//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;
public class PrintAllTheFactorsOfNumber 
{
    public static void main(String[] args)
     {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n= in.nextInt();

        for (int i=1 ; i<=n ; i++)
        {
            if(n % i==0)
            {
              System.out.println(+i);
            }

        }
    }
}
