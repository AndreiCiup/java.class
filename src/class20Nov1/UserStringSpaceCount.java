package class20Nov1;

import java.util.Scanner;

public class UserStringSpaceCount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write something: ");
        String str= scan.nextLine();
        System.out.println("Number of spaces in the String is: "+countSpaces(str));
         if(countSpaces(str)<5){
             System.out.println("String is Small");
         }else if (countSpaces(str)>=5 && countSpaces(str)<10){
             System.out.println("String is Medium");
         }else{
             System.out.println("String is Large");
         }
    }


    static int countSpaces(String str){
        int count=0;
        for( int i=0; i<str.length(); i++){
            if (str.charAt(i)==' '){
                count ++;
            }
        }
        return count;
    }
}
