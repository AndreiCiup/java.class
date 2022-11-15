package class05;

public class homework928 {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;


        System.out.println(i + j); //30
        System.out.println("i + j"); //i+j
        System.out.println(str1 + j); //Hello20
        System.out.println(str1+i + j); //Hello1020
        System.out.println(i + j+str1);  //30Hello
        System.out.println(str1+i * j);   //Hello200
        System.out.println(str1+(i - j));  //Hello-10, otherwise without () it will give an error!
        System.out.println(str1+i + j+str2); //Hello1020Java
    }
}
