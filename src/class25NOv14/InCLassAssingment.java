package class25NOv14;

import java.sql.SQLOutput;

public class InCLassAssingment {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";
        String words[] = str.split(" ");
       for(String word: words){
           System.out.println(word+"="+word.length());
        }
    }
}
