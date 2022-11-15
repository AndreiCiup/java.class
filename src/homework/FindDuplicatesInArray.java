package homework;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int[] result = new int[data.length];
        int count=0;
        for (int i=0; i<data.length-1; i++){
            for (int j=i+1; j< data.length; j++){
                if(data[i]==data[j]){
                    count++;
                    if(count==j){
                        result[i]=data[i];
                        System.out.println(result[i]);
                    }
                }
            }
        }
    }
}

