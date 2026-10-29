package PackagePayment;

public class ClassPaymentService {
    private String bankApikey = "BANK-123";

    public void DisplayClassPaymentService(){
        System.out.println("ClassPaymentService from PackagePayment");
    }

    public String processPayment(String ticketId, double amount){
        boolean ok = validatePayment(amount);
        if(ok){
            return "Payment SUCCESS for " + ticketId + " - Amount: " + amount + " UGX";
        }
        else{
            return "Payment FAILED";
        }
    }
    private boolean validatePayment(double amount){
        System.out.println("Internal: Validating with bank key " + bankApikey);
        return true;
    }
}
