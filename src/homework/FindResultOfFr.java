package homework;

public class FindResultOfFr {
    public static void main(String[] args) {
        double i;
        int j;
        double sum=0;
        for(i=1,j=2;i<=10 && j<=11;i++,j++){
            sum=sum+i/j;
        }
        System.out.println(sum);
    }
}
