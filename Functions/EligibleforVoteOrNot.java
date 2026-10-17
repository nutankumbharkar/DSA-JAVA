//  A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.

package Functions;
import java.util.Scanner;
public class EligibleforVoteOrNot 
{
   static String EligibleVote(int age)
   {
    if(age>=18)
    {
        return "Eligible";
    }
    else
    {
       return "Not Eligible";   
    }
   } 
   public static void main(String[] args) 
   {
      Scanner in =new Scanner(System.in);
      System.out.println("Enter Age:");
      int age=in.nextInt();
     System.out.println( EligibleVote(age));
   }
}
