package ArtithmaticOpreators;
import java.util.Scanner;
public class LogicalOpreator {
    public static void main(String[] args) {
        /*int num1 = 20;
        int num2 = 30;
        int num3 = 50;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("******* Welcome to my Program *******");
        System.out.println("Enter firts number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third number");
        int num3 = scanner.nextInt();
        System.out.println("num1 is :" + num1);
        System.out.println("num2 is :" + num2);
        System.out.println("num3 is :" + num3);
        //Logical & oprator
        //System.out.println((num1<num2) & (num1<num3));
        //Logical || oprator
        System.out.println((num1<num2) || (num1<num3));

    }
}
