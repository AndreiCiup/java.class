package homework;

public class FindResultOf {
    public static void main(String[] args) {
        int i=10;
        int j=1;
        int sum=0;
        while(i>j){
            sum=sum+i+j;
            i--;
            j++;
        }
        System.out.println(sum);
    }
}
