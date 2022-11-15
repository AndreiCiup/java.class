package homework;

public class AscendingOrder {
    public static void main(String[] args) {
        int data[]={5, 2, 8, 7, 3, 6};
        int store=0;
        for (int i=0; i<data.length-1;i++){
            for (int j=i+1; j<data.length; j++){
                if (data[i]>data[j]){
                    store=data[i];
                    data[i]=data[j];
                    data[j]=store;


                }
            }
            System.out.println(data[i]);
        }
    }
}
