//  Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a Num1:");
       int Num1 = sc.nextInt();

       System.out.println("Enter a Num2:");
       int Num2 = sc.nextInt();
       
       if(Num1 > Num2)
       {
        System.out.println(Num1 + " is Greater Than " + Num2);
       }
       else if(Num1<Num2)
       {
          System.out.println(Num2 + " is Greater Than " +Num1);
       }
       else
       {
        System.out.println("Both are Equal");
       }
       

    }
}
