package homework;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int data[]={23, 44, 21, 23, 27, 35, 75, 44, 25};
        String dup=" The duplicate numbers are: ";

        for (int i=0; i<data.length; i++){
            for (int j=i+1; j<data.length; j++){
                if (data[i] == data[j]){
                   dup=dup+" "+data[i]+",";
                }
            }
        }
        System.out.println(dup.substring(0,dup.length()-1));
    }
}
