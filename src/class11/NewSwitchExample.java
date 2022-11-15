package class11;

import java.util.Scanner;

public class NewSwitchExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1= scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2= scan.nextInt();
        System.out.println("Please enter the operation: ");
        String oper= scan.next();
        switch (oper){
            case "Add":
                System.out.println("The result is: "+(num1+num2));
                break;
            case "Sub":
                System.out.println("The result is: "+(num1-num2));
                break;
            case "Mul":
                System.out.println("The result is: "+(num1*num2));
                break;
            case "Div":
                System.out.println("The result is: "+(num1/num2));
                break;
            case "Mod":
                System.out.println("The result is: "+(num1%num2));
                break;
            default:
                System.out.println("Please enter the operation: ");
        }

    }
}
