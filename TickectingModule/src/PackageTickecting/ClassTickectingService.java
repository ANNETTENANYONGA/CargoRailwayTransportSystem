package PackageTickecting;

import PackagePayment.ClassPaymentService;
import PackageRoute.ClassRouteService;

public class ClassTickectingService {
    private String ticketing = "TICKET";

    public void DisplayClassTickectingService(){
        System.out.println("ClassTickectingService from PackageTickecting");
    }
    public void bookTicket(String passenger, String from, String to, double amount){
        System.out.println("Booking ticket for: "+ passenger);
        ClassRouteService routeService = new ClassRouteService();
        String routeInfo = routeService.getRouteInfo(from, to);
        System.out.println("Ticket " + routeInfo);
        ClassPaymentService paymentService = new ClassPaymentService();
        String paymentResult = paymentService.processPayment("TICKET-001" , amount);
        System.out.println(paymentResult);
        System.out.println("Ticket BOOKED for " + passenger);
    }
}
