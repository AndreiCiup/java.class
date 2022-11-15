package class05;
import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert first number ");
        int a= sc.nextInt();
        System.out.println("Please insert second number ");
        int b=sc.nextInt();
        System.out.println("The sum of two numbers is" +"\n" + (a+b));

        System.out.println(a+b);
    }
}
