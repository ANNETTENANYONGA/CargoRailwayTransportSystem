import PackageMaintenance.ClassMaintenanceService;
import PackagePayment.ClassPaymentService;
import PackageRoute.ClassRouteService;
import PackageTickecting.ClassTickectingService;
import PackageCargo.ClassCargoService;


public class Main {
    public static void main(String[] args){
        new ClassMaintenanceService ().DisplayClassMaintenanceService();
        new ClassPaymentService ().DisplayClassPaymentService();
        new ClassRouteService () .DisplayClassRouteService();
        new ClassTickectingService () .DisplayClassTickectingService();
        new ClassCargoService () .DisplayClassCargoService();
        new ClassCargoService(). trackCargo("CARGO-001" , "Kampala","Jinja");
        new ClassMaintenanceService(). scheduleMaintenance("Kampala", "Gulu");
        new ClassTickectingService(). bookTicket("John","Kampala", "Mbarara",100000);
    }
}
