package homework;

public class TheGreatestNumberInTheArray {
    public static void main(String[] args) {
        int data[]={23, 44, 21, 56, 27, 35, 75, 34, 25};
        int max=data[0];
        for (int i=0; i<data.length ; i++){
            if (data[i]>max){
                max=data[i];
            }
        }
        System.out.println("The greatest number in the array is: "+ max);

    }
}
