package homework;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int data[]={23, 44, 21, 56, 27, 35, 75, 34, 25};
        int evsum=0;
        int odsum=0;
        for(int i=0; i<data.length; i++){
            if(data[i]%2==0){
                evsum=evsum+data[i];
            }else{
                odsum=odsum+data[i];
            }
        }
        System.out.println("The sum of even numbers in the array is: "+evsum);
        System.out.println("The sum of odd numbers in the array is: "+odsum);
    }
}
