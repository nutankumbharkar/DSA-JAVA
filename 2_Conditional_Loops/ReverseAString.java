//    Reverse A String In Java
import java.util.Scanner;
public class ReverseAString 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=in.nextLine();

        String reverse = "";

         for (int i = str.length()-1; i >= 0; i--)
            {
                  reverse = reverse + str.charAt(i);
            }
            System.out.println(reverse);
    
    }
}
