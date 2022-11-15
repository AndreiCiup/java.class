package homework;
import java.util.Scanner;
public class HMW3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double a, d;
        System.out.println("Please insert the bill amount in $: ");
        a=x.nextDouble();
        System.out.println("Please insert the discount amount in %: ");
        d=x.nextDouble();
        System.out.println("Your final bill after discount adjustment is "+(a-a*(d/100))+" $");
    }
}
