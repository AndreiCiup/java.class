package class06;
import java.util.Scanner;
public class SAnotherone {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Please insert your age: ");
        double a=x.nextInt();

        double b,c,d, e, f;
                b=a*12;
        c=a*365;
        d=c*24;
        e=d*60;
        f=e*60;
        System.out.println("You have spent: " +b+"month on Earth ");
        System.out.println("You have spent: " +c+"days on Earth ");
        System.out.println("You have spent: " +d+"hours on Earth ");
        System.out.println("You have spent: " +e+"minutes on Earth ");
        System.out.println("You have spent: " +f+"seconds on Earth ");

    }
}
