package class25NOv14;

public class recap {
    public static void main(String[] args) {
        int info[][]={{23,24,56},{34,56,76}, {87,65,43}};
        for( int[] num: info){
            for (int num1:num){
                System.out.print(num1+" ");
            }
            System.out.println();
        }
    }
}
