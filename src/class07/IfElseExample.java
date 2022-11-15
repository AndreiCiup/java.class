package class07;
import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please insert the first number: ");
        double num1=scan.nextDouble();
        System.out.println("Please insert the second number: ");
        double num2= scan.nextDouble();
        if(num1>num2) {
            System.out.println( num1+" is the maximum number");
        }else if (num1<num2){
            System.out.println( num2+" is the maximum number");
        }else{
            System.out.println("your numbers are equal");
        }
    }
}
