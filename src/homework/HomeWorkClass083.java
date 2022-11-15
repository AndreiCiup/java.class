package homework;

import java.util.Scanner;

public class HomeWorkClass083 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please rate the company (1-5): ");
        int rate= scan.nextInt();
        if (rate==5){
            System.out.println("The rating of the company is Very Good");
        }else if (rate==4){
            System.out.println("The rating of the company is Good");
        }else if (rate==3){
            System.out.println("The rating of the company is Average");
        }else if (rate==2){
            System.out.println("The rating of the company is Poor");
        }else if (rate==1){
            System.out.println("The rating of the company is Very Poor");
        }else{
            System.out.println("Our rating system is based on (1-5) range, please rate the company using the marks from this range");
        }
    }
}
