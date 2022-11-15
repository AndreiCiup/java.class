package Practice;

public class PatternOwnTry {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for (int s=1; s<=i; s++){
                System.out.print(" ");
            }
            for (int j=5-i; j>=1; j--){
                System.out.print("A");
            }
            System.out.println();
        }
        for (int i=0; i<=5; i++){
            for (int s=5; s>=1; s--){
                System.out.print(" ");
            }
            for (int j=0; j>=5; j++){
                System.out.print("A");
            }
            System.out.println();
        }

    }
}
