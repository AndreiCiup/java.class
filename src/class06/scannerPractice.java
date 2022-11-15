package class06;
import java.util.Scanner;
public class scannerPractice {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);

        System.out.println("Please insert the first number: ");
        double a=x.nextDouble();
        System.out.println("Please insert the second number: ");
        double b=x.nextDouble();
        System.out.println("Please insert the third number: ");
        double c=x.nextDouble();
        System.out.println((a+b+c)/2);

    }
}
