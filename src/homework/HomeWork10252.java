package homework;

import java.util.Scanner;

public class HomeWork10252 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the power consumed in a given unit: ");
        double read= scan.nextDouble();
        if (read>=0 && read<=200){
            System.out.println("The bill amount to be paid based on your consumption is: "+read*0.5+" $");
        }else if (read>=201 && read<=400){
            System.out.println("The bill amount to be paid based on your consumption is: "+(read*0.65+100)+" $");
        }else if (read>=401 && read<=600){
            System.out.println("The bill amount to be paid based on your consumption is: "+(read*0.8+230)+" $");
        }else if (read>600){
            System.out.println("WOW. YOU must have been running a mining farm, your bill is $$$");
        }else{
            System.out.println("The power consumed by the unit can't be less than 0");
        }
    }
}
