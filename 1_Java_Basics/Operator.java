// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operator
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter a 2nd  Number");
        int b = sc.nextInt();

        System.out.println("Enter a Operator");
        char op = sc.next().charAt(0);

         
        if(op == '+')
        {   
            int sum = a+ b;
            System.out.println( "Addition is: "+ sum );
        }
        else if(op == '-')
        {   
            int sum = a- b;
            System.out.println("Subtraction is :"+ sum );
        }
        else if(op == '*')
        {   
            int sum = a* b;
            System.out.println("Multiplication is :"+ sum );
        }
        else if(op == '/')
        {   
            int sum = a / b;
            System.out.println("Division is :"+ sum );
        }
        else
        {
            System.out.println("Invalid Operator");
        }

    }
}
