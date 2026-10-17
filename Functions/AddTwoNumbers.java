// Add two Numbers take input from user
package Functions;
import java.util.Scanner;

public class AddTwoNumbers 
{
    static  int AddNumbers(int b,int a)
    {
        int sum =a+b;
        //stem.out.println("Addition is:" +sum);
        return sum;
     }
     public static void main(String[] args) 
     {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a =in.nextInt();

        System.out.println("Enter 2nd Number:");
        int b=in.nextInt();
      int sum = AddNumbers(a,b);

       System.out.println("Addition is :" +sum); 
     }
}
