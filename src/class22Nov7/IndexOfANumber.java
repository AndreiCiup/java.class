package class22Nov7;

public class IndexOfANumber {
    public static void main(String[] args) {
        int data[] = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum = 76;
        System.out.println("The index of the given number is: "+findIndex(data, targetNum));
    }

    static int findIndex(int[] data, int targetNumber) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetNumber) {
                return i;
            }
        }
        return 1;
    }

}
