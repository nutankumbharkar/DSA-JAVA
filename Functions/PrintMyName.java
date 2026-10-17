package Functions;
import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = in.nextLine();

        printName(name);
    }

    static void printName(String name) {
        System.out.println("My name is " + name);
    }
}