package class24Nov9;

public class TwoDArray {
    public static void main(String[] args) {
        int info[][]={ {23, 44, 32}, {45, 42, 31}, {73, 14,0}};
       for (int i=0; i<info.length; i++){
           for (int j=0; j<info[i].length; j++){
               System.out.print(info[i][j]+" ");

           }
           System.out.println();
       }


    }

}
