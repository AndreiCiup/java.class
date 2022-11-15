package homework;

import java.util.Scanner;

public class HW1018 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the temperature in CElSIUS: ");
        double T= scan.nextDouble();
        System.out.println("The temperature in Fahrenheit is: "+convertTemperature(T));

    }
    static double convertTemperature(double conv){
        double convertTemperature=conv*9/5+32;
        return convertTemperature;
    }
}
