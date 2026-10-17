// Write a function that returns all prime numbers between two given numbers.

package Functions;
import java.util.Scanner;

public class PrimeBetweenTwoNumbers
{
    static void Prime(int num1, int num2) {

    for (int i = num1; i <= num2; i++) 
    {

        boolean isPrime = true;

        if (i < 2) 
        {
            isPrime = false;
        }

        for (int j = 2; j < i; j++) 
        {
            if (i % j == 0) 
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime) 
        {
            System.out.print(i + " ");
        }
    }
}
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=in.nextInt();
        System.out.println("Enter num2:");
        int num2=in.nextInt();

        Prime(num1, num2);


    }
}
