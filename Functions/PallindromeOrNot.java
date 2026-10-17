//  Write a function to find if a number is a palindrome or not. Take number as parameter.

package Functions;

import java.util.Scanner;

public class PallindromeOrNot 
{
    static boolean palindrome(int n) 
    {
    int original = n;
    int rev = 0;

    while (n > 0)
         {
           int digit = n % 10;
           rev = rev * 10 + digit;
            n = n / 10;
         }

    return original == rev;
}
public static void main(String[] args) 
{
   Scanner in=new Scanner(System.in);
   System.out.println("Enter a Number:");
   int n=in.nextInt();
   System.out.println(palindrome( n));   
}
}
