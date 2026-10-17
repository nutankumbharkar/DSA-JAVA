//  Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class LargestNumUntilUserEnter0 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int n = 1;
         int largest = Integer.MIN_VALUE;

while (n != 0) {
    System.out.println("Enter the Number:");
    n = in.nextInt();

    if (n != 0 && n > largest) {
        largest = n;
    }
}

       System.out.println("Largest Number is : " + largest);
    }
}