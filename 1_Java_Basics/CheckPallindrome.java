
// To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class CheckPallindrome
{
   public static void main(String[] args) 
   {
      Scanner sc =new Scanner(System.in);

      System.out.println("Enter a String:");
      String pall = sc.nextLine();
      
    
       String rev ="";

       for (int i = pall.length() - 1; i >= 0; i--)
       {
        rev = rev + pall.charAt(i);
       }
       {
           if(pall.equals(rev))
           {
               System.out.println("Pallindrome");
            }
           else 
           {
              System.out.println("Not Pallindrome");
            }
        }

   }
}
