package homework;

public class PrintSum1To50 {
    public static void main(String[] args) {
        int num;
        int sum=0;
        for(num=1;num>=1 && num<=50;num++){
            if (num%3==0 || num%5==0){
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
