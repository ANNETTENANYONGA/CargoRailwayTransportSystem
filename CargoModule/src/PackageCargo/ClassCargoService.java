package PackageCargo;

import PackageRoute.ClassRouteService;
public class ClassCargoService {
    private double cargoWeight = 500;
    private String cargoOwner = "OWNER";

    public void DisplayClassCargoService(){
        System.out.println("ClassCargoService from PackageCargo");
    }

    public void trackCargo(String cargoId, String from, String to){
        System.out.println("Tracking Cargo: " + cargoId + " - Weight: " + cargoWeight);
        ClassRouteService routeService = new ClassRouteService();
        String routeInfo  = routeService.getRouteInfo(from, to);
        System.out.println("Cargo " + cargoId + " is using " + routeInfo);
    }
}
