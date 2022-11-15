package homework;

public class FindTheSumOfColumn {
    public static void main(String[] args) {
        int[][] data={{23, 44, 21},{45, 42, 31},{73, 14, 0}};
        int sum=0;
        for (int i=0; i<data.length; i++){
            for (int j=0; j< data[i].length; j++) {
                sum = sum + data[j][i];

            }

            System.out.println(sum + " ");
        }

    }
}
