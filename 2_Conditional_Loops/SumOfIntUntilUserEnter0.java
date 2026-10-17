//  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class SumOfIntUntilUserEnter0 
{
    public static void main(String[] args) 
    {
         Scanner in =new Scanner(System.in);
         int n=1;
         int sum=0;
        while(n!=0)
        {
          System.out.println("Entre a Number:");
          n =in.nextInt(); 

          sum = sum + n;
        } 
        System.out.println("Sum Of Numbers:"+ sum);
        
    }
}
