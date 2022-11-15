package class24Nov9;

public class SumOfElementRowWise {
    public static void main(String[] args) {
        int info[][] = {{23, 44, 21}, {45, 42, 31}, {73, 14, 0}};
        int sum[] = new int[info.length];

        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
               sum[j]=sum[i]+info[i][j];
            }
            System.out.println(sum[i]+" ");
        }
    }
}