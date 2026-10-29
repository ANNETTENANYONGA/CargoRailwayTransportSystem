package PackageMaintenance;

import PackageRoute.ClassRouteService;

public class ClassMaintenanceService {
    private String maintenance = "MAINT";

    public void DisplayClassMaintenanceService(){
        System.out.println("ClassMaintenanceService from PackageMaintenance");
    }

    public void scheduleMaintenance(String from, String to){
        System.out.println("Checking route for maintenance");
        ClassRouteService routeService = new ClassRouteService();
        String routeInfo = routeService.getRouteInfo(from, to);
        System.out.println("Maintenance Scheduled for " + routeInfo);
    }
}
