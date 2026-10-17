package Functions;
import java.util.Scanner;

public class PrintSquartRoot 
{
    static int sqrtroot(int n)
    {
        int result=n*n;
        return result;
    }
    
public static void main(String args[])
{
    Scanner in =new Scanner(System.in);
    System.out.println("Enter Number:");
    int n=in.nextInt();
    int result=sqrtroot(n);
    System.out.println(+result);

}
}
