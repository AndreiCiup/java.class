package class26Nov15;

public class Bank {
    public static void main(String[] args) {

    }
    double balance;
    String accName;
    String accNumber;


    Bank(String accNAmeFRomUser, double balFromUser){
        accName=accNAmeFRomUser;
        balance=balFromUser;
        accNumber=accName+balance;

    }
}
