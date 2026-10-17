//Write a function that returns the sum of first n natural numbers.

package Functions;
import java.util.Scanner;
public class SumOfnNaturalNum 
{
    static int Sum(int num)
    
    {
        int Add=0;
        for(int i=1;i<=num;i++)
        {
             Add=Add + i;
        }
        return Add;
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int num =in.nextInt();

        System.out.println(Sum(num));
        
    }
    
}
