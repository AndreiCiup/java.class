package class10;

import java.util.Scanner;

public class HomeWorkTuesday {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your 3-digit number: ");
        int reverse=0;
        int num= scan.nextInt();
        reverse=num%10*100+((num%100)/10)*10+num/100;
        if (num>99 && num<1000){
            System.out.println("The reverse version of your given number is: "+reverse);
        }else{
            System.out.println("You should enter a 3-digit number");
        }
    }
}
