package homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.lwawt.macosx.CPrinterDevice;

public class AllPrimeNumbers {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count==2){
            System.out.print(num+" ");
            }

        }
    }
}
