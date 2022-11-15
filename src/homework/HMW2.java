package homework;
import java.util.Scanner;
public class HMW2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        double  P, r, t, R;
        System.out.println("Please insert your principal amount in $: ");
        P=x.nextDouble();
        System.out.println("Please insert your rate of interest in %: ");
        r=x.nextDouble();
        System.out.println("Please insert the amount of years for your loan: ");
        t=x.nextDouble();
        R=P*(r/100)*t;
        System.out.println("The simple interest for your loan is "+R);
    }
}
