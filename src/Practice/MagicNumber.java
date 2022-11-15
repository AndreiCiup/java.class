package Practice;

public class MagicNumber {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            if(i%5==4 && i%4==3 && i%3==2 && i%2==1){
                System.out.println("The magic number is: "+i);
            }
        }
    }
}
