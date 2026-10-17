//  Java Program Vowel Or Consonant

import java.util.Scanner;

public class VowelOrConsonant 
{
    public static void main(String[] args) 
    {
        Scanner in =new Scanner (System.in);
        System.out.println("Enter a Character:");
        char ch = in.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch==  'o' || ch == 'u')
        {
            System.out.println("This is Vowel");
        }
        else if ((ch >= 'a' && ch <= 'z') ||
         (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("this is consonant");
        }
        else
        {
            System.out.println("This is not alphabet");
        }

    }
    
}
