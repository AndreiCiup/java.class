package class26Nov15;

public class CompanyMain {
    public static void main(String[] args) {
        String companyName="Telsa";
        new Company(companyName);
        System.out.println("#####################");
        Company Tesla1=new Company("model3",180000,2022, 59000);
        System.out.println("=======================");
        Company Tesla2=new Company("modelY", 180000,2022,70000);
        System.out.println("=======================");
        Company Tesla3=new Company("modelS",15000,2022,100000);
        System.out.println("=======================");
        Company Tesla4=new Company("modelX",15000,2022,150000);

        System.out.println();

       new Company();

        Company model3=new Company(350,3.1,160);
        System.out.println("+++++++++++++++++++");
        Company modelY=new Company(330,3.0,150);
        System.out.println("+++++++++++++++++++");
        Company modelS=new Company(380,2.5,200);
        System.out.println("+++++++++++++++++++");
        Company modelX=new Company(400, 2.0,200);

    }
}
