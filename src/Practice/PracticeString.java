package Practice;

public class PracticeString {
    public static void main(String[] args) {
        String str = "evenly";
        String c = "ly";
        String b = str.substring(str.length() - 2);
        System.out.println(b);
        System.out.println(c);
        if (b.equals(c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}