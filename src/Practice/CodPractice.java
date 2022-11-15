package Practice;

import java.util.Scanner;

public class CodPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=scan.nextLine();
            int count=0;
            String a=str.substring(0,2);
            String b=str.substring(2);
            for(int i=0; i<str.length()-2; i++){
                if(a.equals(b.substring(i,i+2))){
                    count++;
                }
            }
        System.out.println(count);
        }

    }
