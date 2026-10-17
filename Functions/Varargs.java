package Functions;

public class Varargs 
{
    
    static void show(int...a) {
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        show(10, 20, 30, 40);
    }
}







    

