package LAB5.lab5_7;

public class PayrollProcessor {

    public static void process (Employee e){
        
        e.calculatePay();

        System.out.println(e.name + " total pay : " + e.calculatePay() );
    }
        
}
