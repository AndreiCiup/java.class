package Practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please introduce the number of classes held: ");
        double num1= scan.nextDouble();
        System.out.println("Please introduce the number of classes attended by you: ");
        double num2= scan.nextDouble();
        System.out.println("The percentage of classes attended by you is: "+num2/num1*100+" %");
        System.out.println("Did you have any medical cause? (Y/N)");
        char chr=scan.next().charAt(0);
        if (chr=='Y' || chr=='y'){
            System.out.println("You had a medical cause");
        } else if (chr=='N'|| chr=='n') {
            System.out.println("You didn't have a medical cause");
        }else{
            System.out.println("You have to answer (Y/N) or (y/n). Therefore the medical cause won't be calculated.");
        }
        System.out.println("Let's see if you are allowed to sit at exam");
        if ((num2/num1*100)<75 && (chr=='N'|| chr=='n')){
            System.out.println("Unfortunately your attendance to the classes is less than 75%, you will not be allowed to sit in exam.");
        }else if((num2/num1*100)<75 && (chr=='Y'|| chr=='y')||((num2/num1*100)>=75 && (num2/num1*100)<=100)){
            System.out.println(" Your attendance to the classes is acceptable, you will be allowed to sit in exam");
        }else{
            System.out.println("Your attendance can't be bigger than the number of classe held");
        }
    }
}
