// Write a program to print the sum of two numbers entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class SumOfTwoNumbers 
{
    static int Add(int a, int b)
    {
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=in.nextInt();
        System.out.println("Enter a 2nd Number:");
        int b=in.nextInt();
        
        System.out.println("Addition is " + Add(a,b));
    }
}

