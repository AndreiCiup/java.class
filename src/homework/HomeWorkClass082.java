package homework;

import java.util.Scanner;

public class HomeWorkClass082 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your bill amount");
        double bill= scan.nextDouble();
        if (bill>=10000){
            System.out.println("You get a discount of 20%. Your final bill is: "+(bill-bill*20/100));
        }else if (bill>=5000){
            System.out.println("You get a discount of 15%. Your final bill is: "+(bill-bill*15/100));
        }else if (bill>=2000){
            System.out.println("You get a discount of 10%. Your final bill is: "+(bill-bill*10/100));
        }else if (bill>=1000){
            System.out.println("You get a discount of 5%. Your final bill is: "+(bill-bill*5/100));
        }else if (bill<1000 && bill>0){
            System.out.println("You get a discount of 0%. Your final bill is: "+bill);
        }else {
            System.out.println("Your bill can't be less than 0");
        }
    }
}
