package class26Nov15;

public class Company {
    String companyName;
    String modelName;
    int numberOfItems;
    double price;
    int yearMake;
    int rangeMilege;
    double acceleration;
    int topSpeed;

    Company(String mName, int nItems, int year, double cprice) {
        modelName = mName;
        System.out.println("The model name is: "+modelName);
        numberOfItems = nItems;
        System.out.println("Numbers of items produced is:"+numberOfItems);
        yearMake = year;
        System.out.println("The year of the model is: "+yearMake);
        price = cprice;
        System.out.println("The price of the model is: "+price);
    }
Company(int rangeMil, double accel, int topSp){
        rangeMilege=rangeMil;
    System.out.println("The range is: "+rangeMil);
        acceleration=accel;
    System.out.println("The acceleration is: "+acceleration);
        topSpeed=topSp;
    System.out.println("The top speed is: "+topSpeed);

}
    Company(String companyName) {
        System.out.println("Hello everyone. This is a small presentation of the company: " + companyName + ".You can check the automaker department for year 2022.");
    }

    Company() {
        System.out.println("Model peroformance info is : ");
    }
}
