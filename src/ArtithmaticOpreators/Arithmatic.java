package ArtithmaticOpreators;
import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        //int a = 20;
        //int b = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Welcome to Artithmatic Opration Program ***\n");
        System.out.println("plz Enter the first Number");
        int a = scanner.nextInt();
        System.out.println("plz Enter the Second10 Number");
        int b = scanner.nextInt();
        System.out.println("Addition is :"+(a+b));
        System.out.println("Substraction is :"+(a-b));
        System.out.println("Multiplication is :"+(a*b));
        System.out.println("Division is :"+(a/b));

    }
}
