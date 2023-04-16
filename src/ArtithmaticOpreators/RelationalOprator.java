package ArtithmaticOpreators;
import java.util.Scanner;
public class RelationalOprator {
    public static void main(String[] args) {
       // int a = 10;
       // int b = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** WelCome to my Program *****");
        System.out.println("Enter firstr Number");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

    }
}
