 
 // Input currency in rupees and output in USD.

 import java.util.Scanner;

 public class RupeeToUSD
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Currency in Rupee :");
        Double rs =sc.nextDouble();

        double currency = 85;

        double USD = rs/currency;

        System.out.println("USD : " + USD);

    }
 }
