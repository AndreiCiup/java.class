package class22Nov7;

public class COuntPositiveAndNegative {
    public static void main(String[] args) {
        int data[]={-12,34,-45,54,-23,56,78,-2,21};
        int pos=0;
        int neg=0;
        for (int i=0; i<data.length; i++ ){
            if (data[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("number of positive numbers is: "+pos);
        System.out.println("number of negative numbers is: "+neg);
    }
}
